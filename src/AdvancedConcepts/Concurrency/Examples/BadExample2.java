package AdvancedConcepts.Concurrency.Examples;

/**
 * What is the output of this code?
 * Try it for yourself by running it (tip: to it multiple times) ;)
 * Why is the output like that?
 */
public class BadExample2 extends Thread{
    static int x = 0;
    static boolean blocked = false;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new BadExample2().start();
        }
        System.out.println(x);
    }

    @Override
    public void run() {
        boolean done = false;
        while (!done) {
            if (blocked) {
                this.yield();
            }
            if (!blocked) {
                blocked = true;
                x++;
                blocked = false;
                done = true;
            }
        }
    }
}