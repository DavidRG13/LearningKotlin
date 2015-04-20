package delegatedproperties

import kotlin.properties.Delegates

class NotNullExample {
    var name: String by Delegates.notNull()

    fun init(name: String) {
        this.name = name
    }
}

//fun main(args: Array<String>) {
//    val user = NotNullExample()
//    // user.name -> IllegalStateException
//    user.init("Carl")
//    println(user.name)
//}
