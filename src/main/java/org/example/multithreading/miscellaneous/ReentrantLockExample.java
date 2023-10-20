package org.example.multithreading.miscellaneous;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// alternative way of synchronized block
//will helps us to Enabling timeouts, fairness and ability to check if lock is available
public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();

    public void performTask(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+ " is in the critical section.");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {

        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
        for(int i=0;i<5;i++){
            Thread thread = new Thread(()-> {
                reentrantLockExample.performTask();
            });
            thread.start();
        }
    }
}
