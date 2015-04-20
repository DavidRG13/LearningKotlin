package delegatedproperties

class CustomDelegate {
    var property: String by Delegate()

    override fun toString() = "Example Class"
}

class Delegate() {
    fun get(thisRef: Any?, prop: PropertyMetadata): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    fun set(thisRef: Any?, prop: PropertyMetadata, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

//fun main(args: Array<String>) {
//    val customDelegate = CustomDelegate()
//    println(customDelegate.property)
//    customDelegate.property = "NEW"
//}
