package AdvancedConcepts.Concurrency.Examples;

/**
 * Now, maybe this code will run a bit more deterministic...
 */
public class GoodExample implements Runnable{
    static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new GoodExample());
            t.start();
            t.join();
        }
        System.out.println(x);
    }

    @Override
    public void run() {
        x++;
    }
}