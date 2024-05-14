package org.example.multithreading.interthreadCommunication.problemTwo;

import java.util.concurrent.CompletableFuture;

public class Chat {
    boolean flag = false;

    public synchronized void Question(String msg) {

            if (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        }
        System.out.println(msg);
            notify();
        flag = true;
    }

    public synchronized void Answer(String msg) throws InterruptedException {
            if (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        System.out.println(msg);
        flag = false;
        notify();

    }
}
