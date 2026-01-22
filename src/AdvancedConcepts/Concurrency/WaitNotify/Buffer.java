package Concurrency.WaitNotify;

public class Buffer {
    public volatile int value;
    /*
    volatile means, that the stuff is stored in the main RAM-memory directly, instead of using the cache of
    a single thread, ensuring the consistency of a variable across all threads
     */

    void
}
