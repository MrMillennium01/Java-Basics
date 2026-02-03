package ObjectOrientedProgramming.AdvancedConcepts;

/**
 * Sometimes we need some throw-away classes - we can just easily implement them on the fly:
 *
 * new AbstractClassName(<params>){<abstract methods>};
 *
 * You cannot reuse them
 */
public abstract class AnonymousClasses{
    abstract void someMethod();
}

class Something extends AnonymousClasses{
    @Override
    void someMethod() {
        System.out.println("Stuff");
    }

    public static void main(String[] args){
        AnonymousClasses a = new AnonymousClasses() {
            @Override
            void someMethod() {
                System.out.println("Anonymous Stuff");
            }
        };
        a.someMethod();
    }
}
