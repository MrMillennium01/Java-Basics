package AdvancedConcepts.Concurrency.Runnable;

/**
 * there is a Runnable interface, with which we can implement
 * that's better than the Threads-class, since it's an interface
 * so some child-classes can extend from an arbitrary parent class,
 * but still be Runnable, since it implements Runnable-interface
 * Runnable is a bit annoying, since you can only start one instance
 * concurrently, unlike Threads, which you can start multiple times
 */
public class Main {
    public static void main(String[] args){
        RunnableExample l = new RunnableExample();
        Thread lol = new Thread(l);

        lol.start();
//        lol.start();
//        lol.start();
//        lol.start();
//        lol.start();
//        lol.start();
    }
}
