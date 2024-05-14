package org.example.multithreading.interthreadCommunication.problemOne;

import java.util.Scanner;

public class PC {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Produced " + Thread.currentThread().getName());
            wait();
            System.out.println("Resumed");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        Scanner scan = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Consumer Thread ");
            scan.nextLine();
            System.out.println(" Return Key pressed ");
            notify();
            Thread.sleep(1000);
        }
    }
}
