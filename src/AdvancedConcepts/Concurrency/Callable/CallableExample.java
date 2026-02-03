package AdvancedConcepts.Concurrency.Callable;

import java.time.LocalTime;
import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {

    @Override
    public String call() throws Exception {
        LocalTime start = LocalTime.now();
        return "Here happens some stuff at " + start;
    }
}
