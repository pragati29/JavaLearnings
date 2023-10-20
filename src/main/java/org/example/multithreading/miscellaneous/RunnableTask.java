package org.example.multithreading.miscellaneous;

public class RunnableTask {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable task without java 8");
            }
        };
        new Thread(r1).start();
        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++)
                System.out.println("Runnable task using java 8");
        };
        new Thread(r2).start();
    }
}
