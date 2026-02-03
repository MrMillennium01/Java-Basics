package ObjectOrientedProgramming.abstractTypes_interfaces;

import java.util.Arrays;

public class MainStuff {
    public static void main(String[] args){
        /**
         * Abstract Classes Stuff
         */
        // AbstractClass h = new AbstractClass(); // cannot be instantiated
        SubClass h = new SubClass();
        h.sayHello();

        SubSubClass s = new SubSubClass();
        s.sayHello();

        AbstractClass m = new SubClass();
        /* this works, since its only declared in the abstract parent class,
         but itself is a normal class
         */
        m.sayHello();

        System.out.println("\n");
        m.introduce("Li");
        h.introduce("David");
        s.introduce("Maxi");

        // variables are chill here
        System.out.println(s.age);
        System.out.println(m.age);
        System.out.println(s.age);

        /**
         * Now to interfaces
         */
        System.out.println(ChildClass.property1 + " and " + ChildClass.property2);
        ChildClass c = new ChildClass();
        System.out.println(c.property3); // still class variable

        /**
         * Now to enums
         */
        SpecificCase d = new SpecificCase();
        System.out.println(d.specificCase);
        System.out.println(Arrays.toString(EnumStuff.values()));
        System.out.println(EnumStuff.valueOf("CASE3"));

        System.out.println(d.specificCase.checkCases()); // calling the method in the enum
        System.out.println(d.specificCase.number); // calling the instance variable
    }
}
