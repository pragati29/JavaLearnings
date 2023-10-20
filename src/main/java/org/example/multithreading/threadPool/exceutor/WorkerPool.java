package org.example.multithreading.threadPool.exceutor;

import java.util.concurrent.*;

public class WorkerPool {
    public static void main(String[] args) throws InterruptedException {
        RejectedExecutionHandlerImpl rejectedhandler=new RejectedExecutionHandlerImpl();

        ThreadFactory threadFactory= Executors.defaultThreadFactory();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,4,10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),threadFactory,rejectedhandler);

        MonitorThread monitorThread = new MonitorThread(poolExecutor,3);
        Thread monitor = new Thread(monitorThread);
        monitor.start();

        for (int i=0;i<10;i++){
            poolExecutor.execute(new WorkerThread("msg "+i));
        }
        poolExecutor.shutdown();
        Thread.sleep(5000);
        monitorThread.shutdown();
    }
}
