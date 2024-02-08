package programming2024.JanurayFirstWeek.prepareInterview;

import java.util.*;
import java.util.stream.Collectors;

public class Parent {

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(5,8,12,90,23,5,9,8);
        HashSet<Integer> integerHashSet= new HashSet<>();
        integerList.stream().filter(i->!integerHashSet.add(i)).forEach(System.out::println);
        Map<String,Integer> maps=new HashMap();
        maps.put("one",1);
        maps.put("one",1);

        try {
            String str = "pragati";
            char[] schar = str.toCharArray();

            for (int i = 0; i < schar.length / 2; i++) {
                char temp = str.charAt(i);
                schar[i] = str.charAt(schar.length - i - 1);
                schar[schar.length - i - 1] = temp;
            }
            System.out.println(schar);
        } catch (Exception e){

        }
    }
    public static void displayDetails(){

    }
}
