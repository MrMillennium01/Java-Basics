package Concurrency.Basics;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new ThreadExample().start(); // now more processes can run in parallel
        new ThreadExample().start();
        // as you can see, both have the same time, when running, so they are concurrent

        Thread lol = new Thread(() -> {
            // that's a anonym method, dont worry, we had this before (see: OOP)
            LocalTime start = LocalTime.now();
            System.out.println("Here a loop will be called after  " + start);
            for (int i = 0; i < 1000000000; i++){
                // 1. Check if someone waved the "stop" flag
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("I was interrupted! Stopping now.");
                    return; // 2. Explicitly exit the method
                }
                System.out.println(i);
            }
        });

        lol.start();
        Thread.sleep(1000);
        lol.interrupt(); // this should interrupt this thread

        /*
        since our PC only has a limited number of cores (and therefore threads)
        it is only possible to run a few things at the same time.
        As you can see here, only a few programs run concurrent, not all
            (Just some general code advice, don't do this for real, please)
         */
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
    }
}
