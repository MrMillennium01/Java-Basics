package AdvancedConcepts.Concurrency.Locking;

import java.util.ArrayList;

/**
 * synchronized
 * lock objects can/should literally be anything except primitives, String or Wrapper classes
 * this example is demonstrated on a locked queue
 */
class ThreadExample {
    ArrayList<Integer> queue = new ArrayList<>();
    private final Object lock = new Object(); // this is the lock object

    void add(int e) throws InterruptedException {
        synchronized (this.lock){
            queue.add(e);
            Thread.sleep(100);
            System.out.println("Added at " + System.nanoTime());
        }
    }

    int getFirst() throws InterruptedException {
        synchronized (this.lock){
            Thread.sleep(100);
            System.out.println("Removed at " + System.nanoTime());
            return queue.removeFirst();
        }
    }
}
