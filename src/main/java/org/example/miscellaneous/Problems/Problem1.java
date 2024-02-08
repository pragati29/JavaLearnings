package org.example.miscellaneous.Problems;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Problem1 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue=new LinkedBlockingQueue<>(2);

        Thread t1=new Thread(()->
        {
            try {
                queue.put("Hello");
                queue.put("World");
                queue.put("!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2=new Thread(()-> {
            try {
                Thread.sleep(1000);
                System.out.println(queue.take());
                System.out.println(queue.take());
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
