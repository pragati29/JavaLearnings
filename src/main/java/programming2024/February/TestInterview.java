package programming2024.February;

import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestInterview {
    public static void main(String[] args) {
       // Spring s ="energy";     String s1 = "enemy";    -> print uncommon characters
      // printUncommonCharacters("energy","enemy");
        anagram("energy","rneeyg");
        printDuplicates(new int[]{2,3,4,5,6,72,3,4});
    }

    private static void printDuplicates(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        boolean dup = false;
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+ " ");
                dup = true;
            }
        }
    }

    private static void anagram(String s, String s1) {
        boolean b=true;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),
                        map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))-1);
            }else{
                b=false;
                break;
            }
        }
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(m.getValue()!=0){
                b=false;
            }
        }
        System.out.println(b);
    }

    private static void printUncommonCharacters(String s, String s1) {
        int[] present = new int[26];
        for (int i = 0; i < 26; i++) {
            present[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            present[s.charAt(i) - 'a'] = 1;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (present[s1.charAt(i) - 'a'] == 1 || present[s1.charAt(i) - 'a'] == -1) {
                present[s1.charAt(i) - 'a'] = -1;
            } else {
                present[s1.charAt(i) - 'a'] = 2;
            }
        }
        for(int i=0;i<26;i++){
            if(present[i]==1||present[i]==2){
                System.out.println((char)(i+'a') +" ");
            }
        }


    }

    static void nonRepeatingCharacter(String s){
        char []arrChars=s.toCharArray();

        Map<Character, Long> collect = s.chars().mapToObj(e->Character.toLowerCase((char)e))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        Character character = collect.entrySet().stream().filter(p -> p.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(character);
       // HashMap
    }
}
