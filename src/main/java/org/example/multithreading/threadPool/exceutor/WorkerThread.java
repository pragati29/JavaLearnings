package org.example.multithreading.threadPool.exceutor;

public class WorkerThread implements Runnable{

    private String message;

    WorkerThread(String s){
        this.message=s;
    }
    @Override
    public void run() {
        System.out.println("Working Thread Start "+Thread.currentThread().getName()+ " " +message);
        processMessage();
        System.out.println("Working Thread Ends here");
    }

    static void processMessage(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
