package programming2024.February;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Feb29Interview {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,4,6,2,9,6,4);
        Map.Entry<Integer, Long> integerLongEntry = list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() > 1).findFirst().get();
        //System.out.println(integerLongEntry.getKey());
        Set<Integer> setAdd=new HashSet<>();
        for(int i:list){
            if(setAdd.contains(i)){
                System.out.println(i);
                break;
            }
            setAdd.add(i);
        }
    }
    private static void maxAndMin(List data) {
        Object o = data.stream().sorted().findFirst().get();

        System.out.println(o);
    }
}
