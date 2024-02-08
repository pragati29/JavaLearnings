package org.example.dependencyInjection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ListExampleThread {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();

        IntStream intStream=IntStream.range(1,20);
        intStream.parallel().filter(x->x%2==0).forEach(System.out::println);

    }
}
