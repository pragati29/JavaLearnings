package org.example.multithreading.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorEx {

    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newScheduledThreadPool(10);
        service.schedule(new Task("Schedular Task"),10, TimeUnit.SECONDS);

        service.scheduleAtFixedRate(new Task("fixedRateDelay"),15,10,TimeUnit.SECONDS);

        service.scheduleWithFixedDelay(new Task("delayed Task"),15,10,TimeUnit.SECONDS);
    }
}
