package programming2024.February;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8ProgrammingDayOne {
    public static void main(String[] args) {
        List<List<Integer>> lists= Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );



        OptionalDouble average = lists.stream().flatMapToInt(e -> e.stream().mapToInt(Integer::intValue)).average();
        System.out.println(average.getAsDouble());
       // int []arr=new int[]{5,9,11,2,8,21,1};
        //secondHighestNumber(arr);
       // findAvg(arr);
    }

    private static void findAvg(int[] arr) {
        double asDouble = Arrays.stream(arr).average().getAsDouble();
        System.out.println(asDouble);
    }

    private static void secondHighestNumber(int[] arrs) {
        Arrays.asList(arrs).stream();
        Arrays.stream(arrs).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(s-> System.out.println(s.toString()));
       // System.out.println(first.get());
    }

    private static void firstNonRepeat(String input) {
        LinkedHashMap<String, Long> collect = Arrays.stream(input.split(""))
                .map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry = collect.entrySet().stream().filter(s -> s.getValue() == 1).findFirst().get();
        System.out.println(stringLongEntry);
    }

    private static void countDuplicatesString(String input) {
        LinkedHashMap<String, Long> collect1 = Arrays.stream(input.split(""))
                .map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect1.entrySet().stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);
    }

    private static void countString(String input) {
        LinkedHashMap<Character, Long> collect = input.chars().mapToObj(s -> Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.entrySet().forEach(s -> System.out.println(s));
        LinkedHashMap<String, Long> collect1 = Arrays.stream(input.split(""))
                .map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect1.entrySet().forEach(s -> System.out.println(s));
    }
}
