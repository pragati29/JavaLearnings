package org.example.multithreading.threadPool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {

    private String taskName;

    public Task(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        try {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time for task name " + taskName + " = " + sdf.format(date));
                } else {
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Time for executing task " + taskName + " = " + sdf.format(date));
                }
                Thread.sleep(1000);
            }
            System.out.println(taskName + " is Complete.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
