package org.example.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ProjectLearning {

    public static void main(String[] args) {
        //System.out.println(removeZero("000salt"));
        int arr[] = { 1, 5, 7, -1, 5 };
        int n = arr.length;
        int sum = 6;
        //printPairs(arr, n, sum);
       // System.out.println(countWays(6));
        //System.out.println(fib(6+1));

        System.out.println(mySqrt(6));
    }

    private static String removeZero(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        StringBuffer sb = new StringBuffer(s);
        sb.replace(0, i, "");
        return sb.toString();
    }

    //Print all pairs with given sum
    private static int[] printPairs(int arr[], int n, int sum) {
        int[] no = new int[2];
        List<List<Integer>> listOfIntegers=new ArrayList<>();
        List<Integer> list = null;
        for (int i = 0; i < n; i++) {
             list=new ArrayList<>();
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
            listOfIntegers.add(list);
        }
       // listOfIntegers.add(list);

        listOfIntegers.stream().forEach(System.out::println);

        return no;
    }
    private static void printPairsUsingHashMap(int arr[], int n, int sum) {
        HashMap<Integer, Integer> mp
                = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int rem =sum-arr[i];
            if(mp.containsKey(rem)){
                int count=mp.get(rem);

            }
        }

    }

    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid > x) {
                end = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }

    private static int countWays(int n){
        int prev=1;
        int prev2=1;
        for(int i=2;i<=n;i++){
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
         }
        return prev;
    }

    static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }

}
