package basics

public class User1 (val firstName: String, val lastName: String, val age: Int) {

    val firstNam: String = firstName
    val lastNam: String = lastName
    val ag: Int = age

    override fun toString() = "$firstNam, $lastNam, age: $ag"

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}
