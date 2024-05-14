package org.example.multithreading.deadlock;

import java.util.concurrent.ConcurrentHashMap;

 class DeadlockDemo {

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread t1 = prepareThread1();
        Thread t2 = prepareThread2();
        t1.start();
        t2.start();

    }


    private static Thread prepareThread1() {
        return new Thread(() -> {
            System.out.println("Thread 1 trying to acquire lock on resource 1");
            synchronized (resource1) {
                System.out.println("Thread 1 Locked resource 1");
                System.out.println("Thread 1 Processing With Resource 1 Before Requesting Lock on Resource 2");
                sleep(5000);
                System.out.println("Thread 1 trying to acquire Lock on resource 2");
                    synchronized (resource2) {
                    System.out.println("Thread 1 Locked resource 2");
                    System.out.println("Thread 1 Processing With Resource 2");
                    System.out.println("Thread 1 Releasing lock on resource 2");
                }
                System.out.println("Thread 1 releasing lock on resource 1");
            }

        });
    }

    private static Thread prepareThread2() {
        return new Thread(() -> {
            System.out.println("Thread 2 trying to acquire lock on resource 2");
            synchronized (resource2) {
                System.out.println("Thread 2 locked resource 2");
                System.out.println("Thread 2 processing with resource 2 before requesting lock on resource 2");
                sleep(5000);
                System.out.println("Thread 2 trying to acquire lock on resource 1");
                synchronized (resource1){
                    System.out.println("Thread 2 locked resource 1");
                    System.out.println("Thread 2 processing with resource 1");
                    System.out.println("Thread 2 releasing lock on resource 1");
                }
                System.out.println("Thread 2 releasing lock on resource 2");
            }


        });
    }

    private static void sleep(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
