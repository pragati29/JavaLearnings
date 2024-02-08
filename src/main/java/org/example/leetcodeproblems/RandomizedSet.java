package org.example.leetcodeproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RandomizedSet {

    static int count = 1;

    static int[] arr;

    public RandomizedSet() {
        arr = new int[count];
    }

    public static boolean insert(int val) {
        for (int i = 0; i < count; i++) {
            if (arr[i] != val) {
                arr[i] = val;
                count++;
                return true;
            }
        }
        return false;
    }

    public boolean remove(int val) {
        return false;
    }

    public int getRandom() {
        int n = 0;
        return n;
    }

    public static String intToRoman(int num) {
        int arr[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romans[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num >= arr[i]) {
                roman.append(romans[i]);
                num = num - arr[i];
            } else {
                i++;
            }
        }
        System.out.println(roman);
        return roman.toString();
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        int x = s.length() - 1;
        while (x >= 0) {
            if (s.charAt(x) == ' ') {
                break;
            }
            count++;
            x--;
        }
        return count;
    }

    // the sky is blue
    public static String reverseWords(String s) {
        s = s.trim();
        String []split=s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i= split.length-1;i>=0;i--){
            String x=split[i];
            if(!x.equals("")){
                sb.append(x).append(" ");
            }
       }
        System.out.println(" String value"+sb.toString() + "end");
        return sb.toString().trim();
    }

    public static String convert(String s, int numRows) {
        String x = "";
        StringBuilder strings[] = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            strings[i] = new StringBuilder();
        }
        int j = 0;
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            if (j == 0)
                b = true;
            if (j == numRows - 1) {
                b = false;
            }
            strings[j].append(s.charAt(i));
            if(b){
                j++;
            }else{
                j--;
            }
        }
        StringBuilder stringAns = new StringBuilder();
        for(int i=0;i<strings.length;i++){
            stringAns.append(strings[i]);
        }
        System.out.println(stringAns);

        return null;
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++){
            if(!hm.containsKey(magazine.charAt(i))){
                hm.put(magazine.charAt(i),1);
            }else{
                hm.put(magazine.charAt(i),hm.get(magazine.charAt(i))+1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            if(hm.containsKey(ransomNote.charAt(i)) && hm.get(ransomNote.charAt(i))>0){
                hm.put(ransomNote.charAt(i),hm.get(ransomNote.charAt(i))-1);
            }
            else{
                return false;
            }
        }
     return true;
    }

    public static boolean isIsomorphic(String s, String t) {
       int []map1=new int[101];
       int []map2=new int[101];
       if(s.length()!=t.length()){
           return false;
       }
       for(int i=0;i<s.length();i++){
           if(map1[s.charAt(i)]!=map2[t.charAt(i)]){
               return false;
           }
           map1[s.charAt(i)]=i;
           map2[t.charAt(i)]=i;
       }
     return true;
    }

    public static boolean isIsomorphicAnother(String s, String t) {
        Map<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(hm.containsKey(cChar)){
                if(hm.get(cChar)!=tChar){
                    return false;
                }
            }else{
                if(hm.containsValue(tChar)){
                    return false;
                }
                hm.put(cChar,tChar);
            }
        }
        return true;
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        String split[] = s.split(" ");
        if (split.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String s1 = split[i];
            if (hm.containsKey(c)) {
                if (!Objects.equals(hm.get(c), s1)) {
                    return false;
                }
            } else {
                if (hm.containsValue(s1)) {
                    return false;
                }
                hm.put(c, s1);
            }
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        hm.entrySet().forEach(e-> System.out.println(e));
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))&&hm.get(t.charAt(i))>0){
                hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
            }else{
                return false;
            }
        }
        hm.entrySet().forEach(e-> System.out.println(e));
        System.out.println(hm.containsValue(1));

        return  true;
    }
 //Input: nums = [2,7,11,15], target = 9
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
//2,7,11,13 tar=9;
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(hm.containsKey(x)&&hm.get(x)!=i){
                return new int[]{i,hm.get(x)};
            }
        }

        return new int[]{};
    }

    public static boolean isHappy(int n) {



   return true;
    }
    public static void main(String[] args) {
        //  RandomizedSet obj = new RandomizedSet();
        // boolean param_1 = obj.insert(2);
        //  boolean param_2 = obj.insert(2);
        //  System.out.println(param_1);
        //  System.out.println(param_2);
      // reverseWords("a good   example");
        //System.out.println(canConstruct("a","ab"));
       // System.out.println(isIsomorphicAnother("BAA","BBA"));
        String s = "dog dog dog dog";
        String pattern = "abba";
        String []split=s.split(" ");

        //System.out.println(wordPattern(pattern,s));
        //System.out.println(isAnagram("anagram","mgranaa"));


     //   Arrays.stream(twoSum(new int[]{3,3}, 6)).forEach(e-> System.out.println(e));
        System.out.println(82/10);
        System.out.println(82%10);
    }
}
