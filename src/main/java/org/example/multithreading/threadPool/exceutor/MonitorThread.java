package org.example.multithreading.threadPool.exceutor;

import java.util.concurrent.ThreadPoolExecutor;

public class MonitorThread implements Runnable{

    ThreadPoolExecutor executor;
    private int seconds;
    private boolean run=true;

    public MonitorThread(ThreadPoolExecutor threadPoolExecutor,int delay){
        this.executor=threadPoolExecutor;
        this.seconds=delay;    }

    public void shutdown(){
        this.run=false;
    }
    @Override
    public void run() {

        while(run){
            System.out.println(
                    String.format("[monitor] [%d%d] Active %d, Completed %d, Task %d, isShutdown() %s, isTerminated: %s",
                            this.executor.getPoolSize(),
                            this.executor.getCorePoolSize(),
                            this.executor.getActiveCount(),
                            this.executor.getCompletedTaskCount(),
                            this.executor.getTaskCount(),
                            this.executor.isShutdown(),
                            this.executor.isTerminated()
                    ));
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
        }
    }
}
