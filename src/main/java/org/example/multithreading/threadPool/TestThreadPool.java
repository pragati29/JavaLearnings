package org.example.multithreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService executors= Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            Runnable worker = new WorkerThread(" " +i);
            executors.execute(worker);
        }
        //executors.shutdown();
        while(!executors.isTerminated()){}
        System.out.println("Finishe All Threads");
    }
}
