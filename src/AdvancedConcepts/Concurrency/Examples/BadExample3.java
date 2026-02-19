package AdvancedConcepts.Concurrency.Examples;

import java.util.ArrayList;

/**
 * So, we're using synchronized now, so possibly nothing could go wrong, right?
 */
public class BadExample3 extends Thread{
    static Integer x = 0;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new BadExample3());
        }
        for (Thread t : threads) {
            t.start();
        }
        System.out.println(x);
    }

    @Override
    public void run() {
        boolean done = false;
        while (!done) {
            synchronized (x) {
                ++x;
                done = true;
            }
        }
    }
}