/**
 * Wrapper classes are, when you have a primitive data type but want a functionality of an object
 * for any primitive type
 */

public class WrapperClasses {
    public static void main (String[] args){
        Integer j = new Integer(24536);
        System.out.println(j);
        System.out.println(j.toString());
        /* not possible with data type int, only with Object Integer:
        int z = 236;
        System.out.println(z.toString());
         */

        int i = Integer.parseInt("52346356"); // most regularly used
        System.out.println(i);

        // autoboxing: mixing everything
        int a = new Integer(60) + 7;
        System.out.println(a);
        Integer b = 40 + 2;
        System.out.println(b);
    }
}
