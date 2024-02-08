package org.example.leetcodeproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem136 {

    public static void main(String[] args) {
      //  singleNumber(new int[]{2,4,5,2,5});
      //   System.out.println("check % "+9%10);
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int singleNumber(int[] nums) {
        String abc="abc";

        int k=0;
        Map<Integer,Integer> integerMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(integerMap.containsKey(nums[i]))
                integerMap.put(nums[i],integerMap.get(nums[i])+1);
            else {
                integerMap.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> m:integerMap.entrySet()){
            if(m.getValue()==1){
                k=m.getKey();
                break;
            }
        }
        System.out.println(k);
        return k;
    }

    public static int lengthOfLongestSubstring(String s) {
        int count=0;
        int j=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(j)&&s.charAt(j)!=s.charAt(j+1)){
                count++;
                j++;
            }
        }
        return count;
    }
}
