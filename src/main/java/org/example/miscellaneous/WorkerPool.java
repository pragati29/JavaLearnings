package org.example.miscellaneous;

import org.example.multithreading.threadPool.exceutor.WorkerThread;

public class WorkerPool implements Runnable{

    private String message;
    WorkerPool(String message){
        this.message=message;
    }
    @Override
    public void run() {
        System.out.println("Thread " +message + " "+ Thread.currentThread().getName());
    }
}
