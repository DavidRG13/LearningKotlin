package basics

fun main(args: Array<String>) {

    // List<String> list = Arrays.asList("a", "b", "c", "d")
    // for (String elements : list) {

    // }


    val list = listOf("a", "b", "c", "d");
    for (element in list) {

    }

    // List<String> list = Arrays.asList("a", "b", "c", "d")
    // int index = 0;
    // for (String elements : list) {
    //    System.out.println(index + " -> " + element);
    //    index++;
    // }


    val list2 = listOf("a", "b", "c", "d");
    for ((index, element) in list2.withIndex()) {
        println("$index -> $element")
    }



    // Iterate over range
    val intRange = 1..10
    for (i in intRange) {}
    for (i in 1..10) {}
    for (c in 'a'..'z') {}
}
