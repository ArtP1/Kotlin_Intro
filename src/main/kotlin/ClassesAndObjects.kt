
// Class declaration
class Person {
    // Properties
    var name: String = ""
    var age: Int = 0

    // Member function
    fun speak() {
        println("Hello, my name is $name and I'm $age years old.")
    }
}


fun main() {
    // Creating instances of the Person class
    val person1 = Person()
    person1.name = "Alice"
    person1.age = 25
    person1.speak()

    val person2 = Person()
    person2.name = "Bob"
    person2.age = 30
    person2.speak()
}
