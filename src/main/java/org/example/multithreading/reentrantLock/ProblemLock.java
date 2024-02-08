package org.example.multithreading.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ProblemLock {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Thread t1=new Thread(()->{
            lock.lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        });

        Thread t2= new Thread(()->{
            lock.lock();
            try {
                Thread.sleep(10);
                System.out.println("hello");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("World");
        System.out.println(4<=0);

    }
}
