package AdvancedConcepts.Concurrency.Interruption;

public class Main {
    public static void main() throws InterruptedException {
        Thread t1 = new InterruptableThread();
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
    }
}
