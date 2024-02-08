package org.example.dependencyInjection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelRead {
    int counter =1;
    static int N;
    public void printOddNumber(){
        synchronized (this){
            while(counter<N){
                while(counter%2==0){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd "+counter);
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber(){
        synchronized (this){
            while(counter<N){
                while(counter%2!=0){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Even " +counter);
                counter++;
                notify();
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        ExcelRead rt=new ExcelRead();
        N=10;
       Thread t1=new Thread(new Runnable() {
           @Override
           public void run() {
               rt.printOddNumber();
           }
       });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                rt.printEvenNumber();
            }
        });

        t1.start();
        t2.start();

    }
}
