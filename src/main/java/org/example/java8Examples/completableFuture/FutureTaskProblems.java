package org.example.java8Examples.completableFuture;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/*
It cannot manually be COMPLETED
Multiple Futures cannot be chained together
we cannot combine multiple futures together
no proper exception handling mechanism
 */
public class FutureTaskProblems {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorsService= Executors.newFixedThreadPool(5);

        Future<List<Integer>> futureTask = executorsService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1, 2, 5, 6);
        });

        List<Integer> integerList = futureTask.get();

        System.out.println(integerList);




    }

    private static void delay(int min){
        try{
            TimeUnit.MINUTES.sleep(min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
