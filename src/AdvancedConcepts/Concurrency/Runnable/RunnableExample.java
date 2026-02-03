package AdvancedConcepts.Concurrency.Runnable;

import java.time.LocalTime;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        LocalTime start = LocalTime.now();
        System.out.println("Here happens some stuff at " + start);
    }
}
