package AdvancedConcepts.Concurrency.Examples;

import java.util.ArrayList;

/**
 * what changed compared to BadExample3 and why is this better?
 */
public class GoodExample2 extends Thread{
    static int x = 0;
    static Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            threads.add(new GoodExample2());
        }
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.println(x);
    }

    @Override
    public void run() {
        boolean done = false;
        while (!done) {
            synchronized (monitor) {
                ++x;
                done = true;
            }
        }
    }
}
