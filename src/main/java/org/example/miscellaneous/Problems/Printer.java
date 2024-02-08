package org.example.miscellaneous.Problems;

public class Printer implements Runnable{
    private Integer maxNumberToPrint;
    private static Integer number;
    private Integer remainder;
    static Object lock=new Object();

    public Printer(Integer max, Integer number, Integer remainder) {
        this.maxNumberToPrint=max;
        this.number=number;
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while(number<maxNumberToPrint-1) {
            synchronized (lock) {
                while(number%2!=remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+":"+number++);
                lock.notifyAll();
            }

        }
    }


}
