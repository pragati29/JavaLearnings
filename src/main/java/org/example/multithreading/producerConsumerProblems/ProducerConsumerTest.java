package org.example.multithreading.producerConsumerProblems;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<>(4);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer=new Consumer(blockingQueue);

        Thread p1=new Thread(producer);
        Thread c1=new Thread(consumer);

        p1.start();
        c1.start();
    }
}
