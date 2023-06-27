import java.util.Random
// TO RUN THE FILE CLICK THE GREEN ▶️ BUTTON ON THE RIGHT TOP OF THE SCREEN

// Functions -------------
    // Function with type String
    fun getGreeting(name: String, role: String): String {
        // when - behaves like a "switch" in C++
        when(role) {
            // if person is employed print (do) this
            "employee" -> return "Hey $name"

            // if person is a manager print (do) this
            "manager" -> return "Welcome Manager!"

            // if person is ....
            "boss" -> return "Welcome boss!"
        }
        return "Unknown user"
    }

    // Default Function like void in C++
    fun sayGoodbye() {
        println("Goodbye")
    }

    fun getPastLocations(name: String, vararg PastLocations: String) {
        for(location in PastLocations) {
            println("- $location")
        }
    }

// fun - stands for function similar to void in C++
fun main(args: Array<String>) { // default main initialization


    // Variables -------------
        // val - behaves like a "const" (can only be assigned once)
        val name: String = "Malik"
        val age: Int = 2;
        val gender: Char = 'M'
        val role: String = "employee"

        val whichLoop: Int = (1..4).random()

        // var - behaves like a regular variable (can be reassigned)
        var name2:String


        // '?' allows to initialize a null variable
        val birth: String? = null
        var address: String? = null
        address = "123 Airforce St"



    // Arrays -------------
        // Type of Initializations
        val pastLocations = arrayOf("Salinas", "Monterey Bay", "Los Angeles")
        println("Number of Past Living Areas: " + pastLocations.size)
        println("Born in: " + pastLocations[0])
        println(pastLocations.get(0))

        // FP
        getPastLocations(name, *pastLocations)




    // Lists -------------
        val ownedCars = listOf("Mustang 5.0", "Tacoma TRD", "Camry TRD")



    // HashMaps -------------
        // Static HashMap - won't/can't be changed
        val hashmap = mapOf(1 to "a",
                            2 to "b",
                            3 to "c")
        hashmap.forEach{key, value ->
            println("$key -> $value")
        }

        // Mutable HashMap - allows to add another pair
        val mutableHashMap = mutableMapOf(1 to "a",
            2 to "b",
            3 to "c")
        mutableHashMap.put(4, "d")






    // Iterations (Loop Types/Methods) -------------
        println("$name used to live in:")

        if(whichLoop == 1) {
            for(location in pastLocations) { // method 1
                println("- $location")
            }
        } else if(whichLoop == 2) {
            pastLocations.forEach { // method 2
                println("- $it")
            }
        } else if(whichLoop == 3) {
            pastLocations.forEach { location -> // method 3
                println("- $location")
            }
        } else if(whichLoop == 4) {
            pastLocations.forEachIndexed { index, location -> // method 4
                println("- $location ($index)")
            }
        }



    // FC
    val greeting = getGreeting(name, role)
    println(greeting)
    sayGoodbye()




    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
