package programming2024.march;

import programming2024.Employee;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) throws IOException {

        List<Person> personList=new ArrayList<>();
        personList.add(new Person("abc",25,"Male"));
        personList.add(new Person("abc",20,"Female"));
        personList.add(new Person("abc",25,"Female"));
        personList.add(new Person("abc",39,"Male"));


        Map<String, Double> collect = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.averagingInt(Person::getAge)));
        System.out.println(collect);


        //findMedianSortedArrays(new int[]{1,2,4},new int[]{3,5});
       // System.out.println(longestPalindrome("pwwkew"));
      //  System.out.println(reverse(-2147483648));
      //  System.out.println(reverse(-214));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       double median =0.0;
       int x= Math.max(nums1.length, nums2.length);

       int[] ints = new int[x];
       int j=0; int k=0;
       for(int i=0;i<x;){
           if(nums1[i]>nums2[k]){
               median=nums1[i];
           }else{
               i++;
               //median=nums1[]
           }
       }

        System.out.println(median);
        return median;
    }
    public static String longestPalindrome(String s) {
        Set<Character> chars=new HashSet<>();
        int max=0;
        int left=0;
        for(int right=0; right<s.length(); right++){
            if(!chars.contains(s.charAt(right))){
                chars.add(s.charAt(right));
                max=Math.max(max,right-left+1) ;
            } else {
                while(chars.contains(s.charAt(right))){
                    chars.remove(s.charAt(left));
                    left++;
                }
                chars.add(s.charAt(right));
            }
        }

        return s.substring(left-1,left+max-1);
        //return s;
    }
    public static int reverse(int x) {
        boolean isNegative = false;
       /* if(x<0&&x>-2147483648){
         return 0;
        }*/
        if (x < 0) {
            isNegative = true;
            x = x / -1;
        }
        int temp = x;
        int count = 0;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        int rev = 0;
        while(x!=0){
            int y = x % 10;
            rev = (int) (rev+ (Math.pow(10,count-1)*y));
            x = x/10;
            count--;
        }
        if ( rev >= Integer.MAX_VALUE ) {
            return 0;
        }
        return isNegative?(int)-rev:(int)rev;
    }
    public static boolean isMatch(String s, String p) {
        boolean m = false;

        return m;
    }
}
