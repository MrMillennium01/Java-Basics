package AdvancedConcepts;

/**
 * You can define classes in classes and also classes in methods (wtf?!)
 * Since defining classes in methods are almost never used, we're going to kindly ignore them
 * Inner classes are classes defined in other classes
 * => alternatively you can define them separately, but usually its more
 * elegant to use inner classes
 *
 * Pros:
 *    inner classes can be static, so they are bound to their parent class
 *      => they can be called via: OuterClass.StaticInnerClass
 *    inner classes can be private to help structure code better
 *      (as a matter of fact, they are almost always private)
 *
 * Static:
 *    you can instantiate these inner classes without an instance of the outer class
 *    => serves the readability and structure of the code
 *    => can be public
 * Non-static:
 *    you can only instantiate these inner classes with an instance of the outer class
 *    => almost always private
 */
public class InnerClasses {
    public static void main(String[] args) {
        OuterClass.stuff();
        OuterClass.StaticInnerClass.stuff();

        OuterClass s = new OuterClass();
        OuterClass.InnerClass i = s.new InnerClass();
        s.something();
        i.something();

        OuterClass.StaticInnerClass j = new OuterClass.StaticInnerClass();
        // this is a instance of a static inner class
        j.stuff();
        j.something();
    }
}

class OuterClass{
    static void stuff (){
        System.out.println("This is the outer class");
    }

    void something(){
        System.out.println("This is the instance method of the outer class");
    }

    /**
     * static inner class
     */
    static class StaticInnerClass extends OuterClass{
        static void stuff(){
            System.out.println("This is the inner class");
        }
    }

    /**
     * private static one - can never be called from the outside
     * this can be seen as a private variable or method, so only usable in the outer class
     * not outside the outer class
     */
    private static class PrivateStaticInnerClass extends OuterClass{
        static void stuff(){
            System.out.println("This is the private inner class");
        }
    }

    /**
     * non-static class
     */
    class InnerClass extends OuterClass{
        @Override
        void something(){
            System.out.println("This is the instance method of the inner class");
        }
    }

    /**
     * non-static private class
     */
    private class PrivateInnerClass extends OuterClass{
        @Override
        void something(){
            System.out.println("This is the instance method of the private inner class");
        }
    }
}
