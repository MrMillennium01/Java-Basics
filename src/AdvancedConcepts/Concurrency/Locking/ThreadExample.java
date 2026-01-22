package Concurrency.Locking;

import java.time.LocalTime;

/**
 * synchronized
 */
class ThreadExample {
    private final int LOCKEDNUMBER;

    ThreadExample(){
        this.LOCKEDNUMBER = 1;
    }

    /**
     * this method example shows, that you can write a method, which only grants access
     * to a specific Object by a specific thread, so it is locked
     * => basically a getter, but locked
     * Also works as setter, generally, when you have data in an Object, which should not be accessed
     * by other Threads, use synchronized()
     * @return the int stored in the Object
     */
    void getExclusiveNumber(){
        synchronized ((Object) LOCKEDNUMBER){
            System.out.println(LOCKEDNUMBER);
        }
    }
}
