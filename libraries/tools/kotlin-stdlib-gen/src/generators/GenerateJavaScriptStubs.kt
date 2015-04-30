package generators

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.util.ArrayList
import java.util.TreeMap
import org.w3c.dom.*
import org.w3c.dom.events.*

/**
* This tool generates JavaScript stubs for classes available in the JDK which are already available in the browser environment
* such as the W3C DOM
*/
deprecated("You shouldn't use it anymore as there is idl2k tool and DOM3 specification")
fun generateDomAPI(file: File): Unit {
    val packageName = "org.w3c.dom"
    val imports = ""

    val classes: List<Class<*>> = arrayListOf(javaClass<Attr>(), javaClass<CDATASection>(),
            javaClass<CharacterData>(), javaClass<Comment>(),
            javaClass<Document>(), javaClass<DocumentFragment>(), javaClass<DocumentType>(),
            javaClass<DOMConfiguration>(),
            javaClass<DOMError>(), javaClass<DOMErrorHandler>(),
            javaClass<DOMImplementation>(), javaClass<DOMImplementationList>(),
            javaClass<DOMLocator>(),
            javaClass<DOMStringList>(),
            javaClass<Element>(),
            javaClass<Entity>(), javaClass<EntityReference>(),
            javaClass<NameList>(), javaClass<NamedNodeMap>(), javaClass<Node>(), javaClass<NodeList>(),
            javaClass<Notation>(), javaClass<ProcessingInstruction>(),
            javaClass<Text>(), javaClass<TypeInfo>(),
            javaClass<UserDataHandler>())

    writeClassesFile(file, packageName, imports, classes)
}

fun generateDomEventsAPI(file: File): Unit {
    val packageName = "org.w3c.dom.events"
    val imports = "import org.w3c.dom.*\nimport org.w3c.dom.views.*\n"


    val classes: List<Class<*>> = arrayList(javaClass<DocumentEvent>(), javaClass<Event>(),
            // TODO see domEventsCode.kt we manually hand craft this for now
            // to get the implementation in JS
            //
            // javaClass<EventListener>(),
            javaClass<EventTarget>(),
            javaClass<MouseEvent>(), javaClass<MutationEvent>(),
            javaClass<UIEvent>())

    writeClassesFile(file, packageName, imports, classes)
}

private fun writeClassesFile(file: File, packageName: String, imports: String, classes: List<Class<*>>): Unit {
    write(file) {

        println("""
package $packageName

$imports

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateJavaScriptStubs.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

// Contains stub APIs for the W3C DOM API so we can delegate to the platform DOM instead

""")


        fun simpleTypeName(klass: Class<out Any?>?): String {
            val answer = klass?.getSimpleName()?.capitalize() ?: "Unit"
            return if (answer == "Void") "Unit" else if (answer == "Object") "Any" else answer
        }

        fun parameterTypeName(klass: Class<out Any?>?): String {
            val answer = simpleTypeName(klass)
            return if (answer == "String" || answer == "Event" || answer.endsWith("DocumentType")) {
                answer + "?"
            } else answer
        }

        for (klass in classes) {
            val interfaces = klass.getInterfaces()
            val extends = if (interfaces != null && interfaces.size == 1) ": ${interfaces[0]?.getSimpleName()}" else ""

            println("deprecated(\"Use org.w3c.dom3 instead\")")
            println("native public interface ${klass.getSimpleName()}$extends {")

            val methods = klass.getDeclaredMethods().sortBy { it.getName()!! }
            if (methods != null) {
                // lets figure out the properties versus methods
                val validMethods = ArrayList<Method>()
                val properties = TreeMap<String, PropertyKind>()
                for (method in methods) {
                    if (method != null) {
                        val name = method.getName() ?: ""
                        fun propertyName(): String {
                            val answer = name.substring(3).decapitalize()
                            return if (answer == "typealias") {
                                "`typealias`"
                            } else answer
                        }
                        fun propertyType() = simpleTypeName(method.getReturnType())
                        fun propertyKind(method: Method): PropertyKind {
                            val propName = propertyName()
                            return properties.getOrPut(propName) { PropertyKind(propName, "val", method) }
                        }

                        val params = method.getParameterTypes()!!
                        val paramSize = params.size
                        if (name.size > 3) {
                            if (name.startsWith("get") && paramSize == 0) {
                                propertyKind(method).typeName = propertyType()
                            } else if (name.startsWith("set") && paramSize == 1) {
                                propertyKind(method).kind = "var"
                            } else {
                                validMethods.add(method)
                            }
                        } else {
                            validMethods.add(method)
                        }
                    }
                }
                
                for (pk in properties.values()!!) {
                    // some properties might not have a getter defined
                    // so lets ignore those

                    val typeName = pk.typeName
                    if (typeName == null) {
                        validMethods.add(pk.method)
                    } else {
                        println("    deprecated(\"Use org.w3c.dom instead\")")
                        println("    public ${pk.kind} ${pk.name}: ${typeName}")
                    }
                }
                for (method in validMethods) {
                    val parameterTypes = method.getParameterTypes()!!

                    // TODO in java 7 its not easy with reflection to get the parameter argument name...
                    var counter = 0
                    val parameters = parameterTypes.map{ "arg${++counter}: ${parameterTypeName(it)}" }.makeString(", ")
                    val returnType = simpleTypeName(method.getReturnType())
                    println("    deprecated(\"Use org.w3c.dom instead\")")
                    println("    public fun ${method.getName()}($parameters): $returnType = noImpl")
                }
            }
            val fields = klass.getDeclaredFields().sortBy { it.getName()!! }
            if (fields != null) {
                if (fields.isNotEmpty()) {
                    println("")
                    println("    public companion object {")
                    for (field in fields) {
                        if (field != null) {
                            val modifiers = field.getModifiers()
                            if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
                                val fieldType = simpleTypeName(field.getType())
                                try {
                                    val value = field.get(null)
                                    if (value != null) {
                                        val fieldType = simpleTypeName(field.getType())
                                        println("        deprecated(\"Use org.w3c.dom instead\")")
                                        println("        public val ${field.getName()}: $fieldType = $value")
                                    }
                                } catch (e: Exception) {
                                    println("Caught: $e")
                                    e.printStackTrace()
                                }
                            }
                        }
                    }
                    println("    }")
                }
            }
            println("}")
            println("")
        }
    }
}

class PropertyKind(val name: String, var kind: String, val method: Method, var typeName: String? = null)

fun write(file: File, block: PrintWriter.() -> Unit): Unit {
    println("Generating file: ${file.getCanonicalPath()}")
    val writer = PrintWriter(FileWriter(file))
    writer.use { writer.block() }
}
