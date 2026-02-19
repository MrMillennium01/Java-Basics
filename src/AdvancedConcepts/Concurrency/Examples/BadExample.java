package AdvancedConcepts.Concurrency.Examples;

/**
 * What is the output of this code?
 * Try it for yourself by running it (tip: to it multiple times) ;)
 * Why is the output like that?
 */
public class BadExample implements Runnable{
    static int x = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new BadExample()).start();
        }
        System.out.println(x);
    }

    @Override
    public void run() {
        x++;
    }
}