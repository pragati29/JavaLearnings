package org.example.dependencyInjection;

import java.util.Arrays;
import java.util.List;

public class ThreadExampleTest implements Runnable {

    List<Integer> listOfInteger;
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("even")){
           listOfInteger.stream().filter(x->x%2==0).forEach(
                   x-> System.out.println("Even Number "+x)
           );
        }
        if(Thread.currentThread().getName().equals("odd")){
            listOfInteger.stream().filter(x->x%2!=0).forEach(
                    x-> System.out.println("Odd Number "+x)
            );
        }
    }

    public static void main(String[] args) {

        ThreadExampleTest test= new ThreadExampleTest();
        test.listOfInteger= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Thread t1=new Thread(test,"even");
        Thread t2=new Thread(test,"odd");
        t1.start();
        t2.start();
    }
}
