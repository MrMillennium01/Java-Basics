package ObjectOrientedProgramming.abstractTypes_interfaces;

/**
 * Java has garbage collectors to manage memories - different to C, which is a hassle
 *
 * Situation: if you have a class hierarchy, you can build instance of every parent and
 *            child class, no matter, if it makes sense
 * Goal: turn this hierarchy, where only the most specific classes (so the child classes
 *       without any further child classes) can be instantiated
 *
 * Meet: abstract classes: they can't be instantiated, so perfect for our goal
 *
 * So typical is that abstract parent classes have almost every info, only small
 * gaps, which will be closed by specific subclasses, so subclasses only contain
 * minimal info and methods, while abstract parent classes contain everything else
 */
public abstract class AbstractClass {
    /**
     * that's an abstract class: it forces all subclasses to override this abstract method
     * this ensures that this method definitely exists in the child classes
     *
     * exception: the subclass is an abstract class itself, then it will just inherit
     * this abstract method further, you don't have to override it
     */
    abstract void sayHello();

    /**
     * typical use case: have s specific method, which calls onto an abstract class, so
     * all the child classes have to specify this
     * @param name just some stuff, not that important
     */
    public void introduce(String name){
        sayHello();
        System.out.println("My name is " + name);
    }

    /**
     * Variables stay the same by the way. Even though you cannot instantiate this
     * class, the instance variables get inherited to the subclasses, where they can be
     * instantiatedö
     */
    int age = 0; // default value
}

class SubClass extends AbstractClass{
    @Override
    void sayHello() {
        System.out.println("Hello, this is a sub-class which can be instantiated!");
    }
}

/**
 * this is an abstract cub-class, so it does not have to override the method
 * of the abstract parent class.
 * It does inherit this abstract method of the parent abstract class further to its child
 * class, as you can see below
 */
abstract class AbstractSubClass extends AbstractClass{}

/**
 * this has to hav a specific method to override, even though its direct parent
 * class does not have this method
 */
class SubSubClass extends AbstractSubClass{
    @Override
    void sayHello() {
        System.out.println("Hey, this is the subclass, which can be instantiated," +
                " of the abstract subclass!");
    }
}
