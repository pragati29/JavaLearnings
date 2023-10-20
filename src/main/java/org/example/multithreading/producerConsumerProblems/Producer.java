package org.example.multithreading.producerConsumerProblems;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private BlockingQueue<Integer> queue;
    Producer(BlockingQueue queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        for(int i=0;i<4;i++){
            try {
                queue.put(i);
                System.out.println("Produced " +i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
