package org.example.java8Examples;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(10,15,18,47,90);
        integerList.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
