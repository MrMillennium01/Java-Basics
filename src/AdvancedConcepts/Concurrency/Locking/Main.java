package AdvancedConcepts.Concurrency.Locking;

/**
 * sometimes you want a thread to have exclusive access to memory for security
 * so no two threads have access to a database at the same time and crash the code
 * every Java Object has a monitor, which monitors which threads are accessind this
 * Object, so we can also control, which threads access a certain object
 * Usage: in finance for example, a System only has access to a database alone
 *
 * As you can see: all access to the queue is one-at-a-time
 */

class Main extends Thread{
    ThreadExample queue = new ThreadExample();

    @Override
    public void run() {
        try {
            queue.add(1);
            queue.getFirst();
            queue.add(2);
            queue.getFirst();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        Thread a1 = new Main();
        Thread a2 = new Main();
        Thread a3 = new Main();
        a1.start();
        a2.start();
        a3.start();
    }
}