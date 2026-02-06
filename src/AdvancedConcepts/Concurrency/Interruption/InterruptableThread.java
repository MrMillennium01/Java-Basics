package AdvancedConcepts.Concurrency.Interruption;

import java.time.LocalTime;

/**
 * this also works with callable or runnable
 */
public class InterruptableThread extends Thread{
    @Override
    public void run(){
        while (!interrupted()){ // here, while(true) and while(!interrupted) is the same
            System.out.println("I'm starting at " + LocalTime.now());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
                Thread.currentThread().interrupt(); // this is important!
            }
        }
    }
}
