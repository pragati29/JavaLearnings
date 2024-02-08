package org.example.miscellaneous;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolQuest {
    public static void main(String[] args) {
        ExecutorService execute = Executors.newFixedThreadPool(3);
        for(int i=0;i<100;i++){
            execute.submit(new WorkerPool("Quest "+i));
        }
        while(!execute.isTerminated()){
            execute.shutdown();
        }
        System.out.println("Completing all thread");
    }
}
