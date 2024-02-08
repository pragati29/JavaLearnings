package programming2024.JanurayFirstWeek.leetcode;

import java.util.*;

public class Problem {

    public static void main(String[] args) {
       // lengthOfLongestSubstringAnotherApproach("pwwkew");
      //  longestPalindrome("abcgfcba");
     //   slidingWindowMaxSum(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20},4);
     //   slidingWindowMaxSumAnother(new int []{100,200,150,400},2);
      //  longestPalindromeAn("cbbd");
        int x[]=twoSum(new int []{2,8,5,3,8},8);
        Arrays.stream(x).forEach(System.out::println);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> characterSet = new HashSet<>();
        int n = s.length();
        int left = 0;
        int max = 0;
        for (int r = 0; r < s.length(); r++) {
            if (!characterSet.contains(s.charAt(r))) {
                characterSet.add(s.charAt(r));
                max = Math.max(max, r - left + 1);
            } else {
                while (characterSet.contains(s.charAt(r))) {
                    characterSet.remove(s.charAt(left));
                    left++;
                }
                characterSet.add(s.charAt(r));
            }
        }
        System.out.println(max);
        return 0;
    }

    public static int lengthOfLongestSubstringAnotherApproach(String s) {
        Map<Character, Integer> characterMap = new HashMap<>();
        int n = s.length();
        int left = 0;
        int max = 0;
        for (int r = 0; r < s.length(); r++) {
            if (!characterMap.containsKey(s.charAt(r))) {
                characterMap.put(s.charAt(r), r);
                max = Math.max(max, r - left + 1);
            } else {
                left = characterMap.get(s.charAt(r)) + 1;
                characterMap.put(s.charAt(r), r);
            }
        }
     characterMap.entrySet().forEach(e-> System.out.println(e));
       System.out.println(max);
        return 0;
    }
    //Ambition
    public static String longestPalindrome(String s) {
        Queue<Character> queue=new LinkedList<>();
        queue.add('s');
        queue.add('a');
        queue.add('n');
        System.out.println(queue);
        queue.add('i');
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        return null;
    }

    public static void slidingWindowMaxSum(int arr[],int k){
        int max=0;
        for(int i=0;i<arr.length-k+1;i++){
            int sum=0;
            int j=0;
            while(j<k){
                sum=sum+arr[i+j];
                j++;
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);

    }
    public static void slidingWindowMaxSumAnother(int arr[],int k){
        int max=0;
        for(int i=0;i<k;i++){
            max=max+arr[i];
        }
        int sum=max;
        for(int j=k;j<arr.length;j++){
            sum=sum+(arr[j]-arr[j-k]);
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }

    public static String longestPalindromeAn(String s) {
     Set<Character> chars=new HashSet<>();
     int n=s.length();
     int j=0;
     int max=0;
     for(int i=0;i<n;i++){
         if(!chars.contains(s.charAt(i))){
             chars.add(s.charAt(i));
             max=Math.max(max,i-j+1);
         }else{
             while(chars.contains(s.charAt(i))){
                 chars.remove(s.charAt(j));
                 j++;
             }
             chars.add(s.charAt(i));
         }
     }
        System.out.println(max);

        System.out.println(s.substring(j-1,j+max-1));
     return s.substring(j-1,j);
    }

    public static int[] twoSum(int arr[],int sum){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i< arr.length;i++){
            int rem=sum-arr[i];
            if(map.containsKey(rem)){
                return new int[]{i,map.get(rem)};
            }
        }
        return new int []{};
    }
}
