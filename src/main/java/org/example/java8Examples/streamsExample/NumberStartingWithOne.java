package org.example.java8Examples.streamsExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(10,15,18,47,90);
        integerList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }

    static void findFirstElement(List<Integer> integerList){
        integerList.stream().findFirst().ifPresent(System.out::println);

        //counting integers from list
        integerList.stream().count();

        //findina max
        integerList.stream().max(Integer::compare).get();

        //sort values
        integerList.stream().sorted().forEach(System.out::println);

        //sort values reverse order
        integerList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }

    //String input = "Java articles are Awesome"
    //outpu j
    static void multiple(String input){
        // firstNonRepeated
        Character chars=input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1l)
                .map(Map.Entry::getKey).findFirst().get();

        //first Repeated
        input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1l)
                .map(Map.Entry::getKey).findFirst().get();

        //Input: String s = "string data to count each character";
        //Output: {s=1, t=5, r=3, i=1, n=2, g=1,  =5, d=1, a=5, o=2, c=4, u=1, e=2, h=2}
        Map<String,Long> mapOfChars = Arrays.stream(input.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));

    }

    public boolean containsDuplicates(int[]num){
        //contains duplicates or not
        List<Integer> integerList = Arrays.stream(num).boxed().collect(Collectors.toList());
        Set<Integer> set =new HashSet<>(integerList);
       // HashMap
        return integerList.size() == set.size();
    }
    public static void findMaxElement(int[]num){

        int max = Arrays.stream(num).max().getAsInt();

    }

    public static void dupElementsWdCount(List<String> li) {

        List<String> list=Arrays.asList("aa","ab","dq","aa");


        Map<String,Long> mapCount=li.stream().filter(x->Collections.frequency(list,x)>1).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }


}
