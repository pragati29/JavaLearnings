package org.example.java8Examples.completableFuture;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.java8Examples.completableFuture.database.EmployeeDatabase;
import org.example.java8Examples.completableFuture.dto.Employee;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo {

    List<Employee> getEmployee() throws ExecutionException, InterruptedException {
        ExecutorService executors=Executors.newFixedThreadPool(5);
        CompletableFuture<List<Employee>> listCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Thread name "+Thread.currentThread().getName());
                return EmployeeDatabase.fetchEmployee();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        },executors);
        return listCompletableFuture.get();
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SupplyAsyncDemo supplyAsyncDemo=new SupplyAsyncDemo();
        List<Employee> employee = supplyAsyncDemo.getEmployee();
        System.out.println(employee.size());

    }
}
