package AdvancedConcepts.Concurrency.Callable;

/**
 * same as Runnable, but you want to have a return type
 */
public class Main {
    public static void main(String[] args) throws Exception {
        CallableExample lol = new CallableExample();

        String lol1 = lol.call();
        String lol2 = lol.call();
        String lol3 = lol.call();
        String lol4 = lol.call();

        System.out.println(lol1);
        System.out.println(lol2);
        System.out.println(lol3);
        System.out.println(lol4);
    }
}
