package abstractTypes_interfaces;

/**
 * We have another problem: classes can only have one parent class
 * When a class should have inherited features of multiple parent classes,
 * we cannot use basic classes as parent class: we need something different
 *
 * Meet: Interfaces
 * Properties: all methods are automatically public and abstract
 *             all variables are automatically public, static and final => they are
 *                  class variables only
 *             cannot be instantiated
 */
interface Interface {
    int property1 = 10; // even not specified, they are static, public and final
}

interface Interface2 {
    int property2 = 15;
    public int property3 = 20;
}

/**
 * this class should implement (another word for inherit in the context of
 * interfaces) both the properties of Interface and Interface2
 */
class ChildClass implements Interface, Interface2{}

/**
 * this subclass inherits from a class and 2 interfaces
 *
 * Generally: you inherit from a main parent class (core functionality
 * and property) and add on some interface stuff
 */
class ChildClass2 extends SubClass implements Interface, Interface2{}