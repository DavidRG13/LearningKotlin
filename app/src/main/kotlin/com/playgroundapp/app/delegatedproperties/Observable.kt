package delegatedproperties

import kotlin.properties.Delegates

class Observable {
    var name: String by Delegates.observable("no name") {
        d, old, new -> println("$old - $new")
    }

    // takes 2 arguments: initial value and modification handler

    // If you want to 'veto' the assignment use vetoable
}

//fun main(args: Array<String>) {
//    val user = Observable()
//    user.name = "Carl"
//}
