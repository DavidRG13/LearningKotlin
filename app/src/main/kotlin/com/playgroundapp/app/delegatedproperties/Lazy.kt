//package delegatedproperties
//
//import kotlin.properties.Delegates
//
//public class Lazy {
//
//    val lazy: String by Delegates.lazy {
//        println("computed!")
//        "my lazy"
//    }
//    // 1st call to get executes the lambda
//    // Remember the result
//    // Next calls simply returns the result
//
//    // blockingLazy
//}
//
//fun main(args: Array<String>) {
//    val sample = Lazy()
//    println("lazy = ${sample.lazy}")
//    println("lazy = ${sample.lazy}")
//}
