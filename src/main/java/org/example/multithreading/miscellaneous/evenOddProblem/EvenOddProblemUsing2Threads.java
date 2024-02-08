package org.example.multithreading.miscellaneous.evenOddProblem;

public class EvenOddProblemUsing2Threads implements Runnable {

    static int count = 1;

    Object obj;

    public EvenOddProblemUsing2Threads(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {

        while (count <= 10) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (obj) {
                    System.out.println("Thread name " + Thread.currentThread().getName() + " value " + count);
                    count++;
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (obj) {
                    System.out.println("Thread name " + Thread.currentThread().getName() + " value " + count);
                    count++;
                    obj.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        Runnable r1 = new EvenOddProblemUsing2Threads(lock);
        Runnable r2 = new EvenOddProblemUsing2Threads(lock);
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();

    }
}
