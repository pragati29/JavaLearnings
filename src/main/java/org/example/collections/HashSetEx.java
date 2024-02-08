package org.example.collections;

import java.util.HashSet;

public class HashSetEx {

    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(6);
        System.out.println("before adding duplicate");
        hashSet.stream().forEach(System.out::println);
        System.out.println("After adding duplicate");
        hashSet.add(4);
        hashSet.stream().forEach(System.out::println);


    }
}
