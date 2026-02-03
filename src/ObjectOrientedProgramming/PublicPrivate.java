package ObjectOrientedProgramming;

/**
 * this class is public, but most of its variables are private
 */

public class PublicPrivate {
    private static int hello = 1;
    private static int bye = 2;
}

class Main{
    public static void main(String[] args){
        // System.out.println(PublicPrivate.hello); // does not work since its private
        System.out.println("Hello");
    }
}
