package Concurrency.Basics;

import java.time.LocalTime;

/**
 * this class contains code, that can run in parallel, you can see that in Main.java
 * thread execution is non-deterministic, so if you have more threads, any order of
 * executions of the threads are possible
 *
 * interrupt():
 *    - it a thread is active, this method will set a flag to true, with which
 *      you can check in the program and if true, go out for example. It does not force
 *      the to stop, since it could break the code
 *    - if the thread is waiting/sleeping, it will be interrupted and stopped
 *
 * join(): If I need results from on thread to be processed in another
 */
class ThreadExample extends Thread {
    /**
     * name for the code, which should be run by .start()
     */
    public void run(){
        LocalTime start = LocalTime.now();
        System.out.println("Here happens some stuff at " + start);
    }

    /**
     * this can not run concurrently, since its name is not run()
     */
    void infinity(){
        while(true){}
    }
}
