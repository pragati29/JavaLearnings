package org.example.multithreading.producerConsumerProblems;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
    Consumer(BlockingQueue queue){
        this.queue=queue;
    }
    int taken=-1;
    @Override
    public void run() {

        while (taken!=4){
            try {
                int taken =queue.take();
                System.out.println("Consumer "+taken);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
