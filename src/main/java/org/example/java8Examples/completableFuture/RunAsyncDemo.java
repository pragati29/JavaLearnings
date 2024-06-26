package org.example.java8Examples.completableFuture;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.java8Examples.completableFuture.dto.Employee;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunAsyncDemo {


    public Void saveEmployee(File jsonFile) throws ExecutionException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
            try {
                List<Employee> employees = objectMapper.readValue(jsonFile, new TypeReference<List<Employee>>() {
                });
                System.out.println("Thread use " + Thread.currentThread().getName());
                System.out.println(employees.size());

            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        return voidCompletableFuture.get();
    }

    Void ownExecutorFramework(File jsonFile) throws ExecutionException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        CompletableFuture completableFuture = CompletableFuture.runAsync(()->{
            try {
                List<Employee> employees = mapper.readValue(jsonFile, new TypeReference<List<Employee>>() {
                });
                System.out.println("Current Thread "+Thread.currentThread().getName());
                System.out.println(employees.size());
            } catch (IOException e) {
                e.printStackTrace();
            }
        },executorService);
        return (Void) completableFuture.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RunAsyncDemo runAsyncDemo = new RunAsyncDemo();
        runAsyncDemo.saveEmployee(new File("employees.json"));
      //  runAsyncDemo.ownExecutorFramework(new File("employees.json"));
    }
}
