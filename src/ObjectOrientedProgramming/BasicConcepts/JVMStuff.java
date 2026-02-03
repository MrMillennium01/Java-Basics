package ObjectOrientedProgramming.BasicConcepts;

/**
 * the JVM first loads and prepares all the classes with their necessary stuff
 * e.g. new calls, super(), this() etc.
 * => then, after all of that, the main method is executed
 * A small example is seen below:
 * ---
 * Additionally, the order of the executions of different classes are
 * from parent class to subclass (priority 1) and from top to bottom (priority 2)
 */
public class JVMStuff {
    static Helper helper1 = new Helper("helper1");

    /**
     * that's a static block, which does some stuff:
     * basically you can run code there as if you were in the main method
     * it executes before the main method, when it is called in the class
     * in some earlier java versions, you could even put all your code from
     * the main method in here, since main() was not mandatory at that time
     * ---
     * Some other properties include:
     *      you can also have any number of static blocks
     *      they run exactly once, regardless of how many times the class is called
     *      they are executed when the class is loaded by the JVM into memory
     *      can't access instance variables or methods directly
     * Use Cases are:
     *      when you need to execute code at class loading time
     *      when you need complex static variable initialization
     */
    static {
        System.out.println("static stuff");
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(JVMStuff.helper1); // only give the memory address
    }
}

class Helper{
    Helper (String s) {
        System.out.println(s);
    }
}
