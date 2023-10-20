package org.example.multithreading.threadPool.exceutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPooltest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {
            if (i == 2 || i == 6) {
                System.out.println("Hello ");
            }
            WorkerThread workerThread = new WorkerThread("s " + i);
            executorService.execute(workerThread);
        }
    }
}
