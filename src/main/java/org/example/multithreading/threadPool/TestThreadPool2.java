package org.example.multithreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool2 {
    static final int MAX_TH=3;

    public static void main(String[] args) {
        Runnable r1= new Task("task 1");
        Runnable r2= new Task("task 2");
        Runnable r3 = new Task("task 3");
        Runnable r4 = new Task("task 4");
        Runnable r5 = new Task("task 5");

        ExecutorService es= Executors.newFixedThreadPool(MAX_TH);
        es.execute(r1);
        es.execute(r2);
        es.execute(r3);
        es.execute(r4);
        es.execute(r5);
        es.shutdown();
    }
}
