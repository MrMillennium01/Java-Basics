package AdvancedConcepts

/**
 * Kotlin is a similar programming language to Java, but somewhat better
 * It is with Java interoperable
 * data classes: these are cool, since this gives you a constructor + setter/getter
 *               automatically, so you don't have to write it on your own
 * There are no primitive data types, all are classes/objects
 */
data class KotlinIntroduction (val givenVariable: Double) {
    // first of all, you don't have to put semicolons
    // var are for variable declaration, which are mutable (changeable)
    // you can also have private/protected/public visibility attributes
    private var integerVariable: Int = 0
    protected var stringVariable: String = "Hello World"
    public var booleanVariable: Boolean = true
    var doubleVariable = givenVariable

    // val are for variable declaration, which are NOT mutable
    val constant: Double = 3.14

    /**
     * this is the syntax for a method/function
     * this is static, since it doesn't take in the object
     */
    fun helloWorld(){
        print("Hello World") // like in python: use print() for terminal messages
    }

    /**
     * this is a instance function, since it takes in self
     */
    fun instanceFunction(){
        print(this.stringVariable)
    }

    /**
     * this is the equivalent to a main-method
     */
    fun main(){
        helloWorld() // how to call methods
        instanceFunction()
        // how to create an object
        var classInstance: KotlinIntroduction = KotlinIntroduction(9.81)
        outerFunction() // you can even call from outside a class
    }
}

/**
 * you can write functions outside of classes
 */
fun outerFunction(){
    print("This function was declared outside of a class!")
}