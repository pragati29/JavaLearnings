package org.example.leetcodeproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProblemLeetCode {
    public static void main(String[] args) {

       //System.out.println(majorityElement(new int []{3,2,3}));
      //  rotate(new int []{1,2,3,4,5,6,7},3);

      //  System.out.print("max " + maxProfit(new int[]{7,1,5,3,6,4}));
      //  System.out.println(canJump(new int[]{3,2,1,4,1}));
       // System.out.println(hIndex(new int[]{4,4,2,1,6}));
        productExceptSelf(new int[]{1,2,3,4});

    }
    public static boolean isPerfectSquare(int num) {
        long low=2 , high=num;
        if(num==1) return true;
        while(low<high){
            long mid = low+(high-low)/2;
            if((mid*mid)==num) return true;
            else if((mid*mid)>num) high=mid;
            else low=mid+1;
        }
        return false;
    }

    public static boolean isPerfectSq(int num){
        int start =1;
        int end=num;
        while(end>start){
            int mid = start +(end-start)/2;
            if((long)(mid*mid)== num)
                return true;
            else if((long)(mid*mid)> num)
                end=mid;
            else
                start=mid+1;
        }
        return false;
    }

    public static int arrangeCoins(int n) {
        int cmpltd=0;
        for(int i=0;i<n;i++){
            int j=0;
            while(j<=i&&n>0){
                n--;
                j++;
            }
            cmpltd++;
        }
        System.out.println(cmpltd);
        return cmpltd;
    }

    public static int removeDuplicates(int[] nums) {
        int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
       // System.out.println("count "+i);
        printArray(nums);

        return i;

    }
    public static int majorityElement(int[] nums) {
        int mElement=0;
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
           /* if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }*/
        }

        int n=nums.length/2;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>n){
             return m.getKey();
            }
        }
        map.entrySet().stream().forEach(e-> System.out.println(e));
        return 0;
    }

    public static int majorityElementAnother(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void rotate(int[] nums) {

        int n=nums.length/2;
        int k=3;

        while(k>=0) {
            for (int i = 0; i < n; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = temp;
            }
            k--;
        }

        printArray(nums);

    }

    public static void rotate(int[] nums, int k) {
       int n=nums.length;
       int i=0;
       int[] nums2=new int[nums.length];
       for(int x=n-k;x<n;x++){
           nums2[i]=nums[x];
           i++;
       }
        for(int l=0;l<n-k;l++){
            nums2[i]=nums[l];
            i++;
        }

        printArray(nums);
        printArray(nums2);
    }

    public static int maxProfit(int[] prices) {
        int k=Integer.MAX_VALUE;
       // int []max=new int[prices.length];
        int max=0;
        int temp=0;
        int sum=0;
        int j=0;
        for(int i=1;i<prices.length;i++){
           if(prices[i]-prices[i-1]>0){
               sum=sum+(prices[i]-prices[i-1]);
           }
        }
        System.out.println("sum "+sum);
       // printArray(max);
        return max;
    }

    public static int canJump(int[] nums) {
        int jump=0;
        int currReach=0;
        int prevReach=0;
        int i=0;
        for(int num:nums){
            currReach=Math.max(currReach,i+num);
            if(i>nums.length-1){
                return jump+1;
            }
            if(prevReach==i){
                jump++;
                prevReach=currReach;
            }
            i++;
        }
        return jump;
    }

    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] buckets = new int[n + 1];
        for (int c : citations) {
            if (c >= n) {
                buckets[n]++;
            } else {
                buckets[c]++;
            }
        }
        int count = 0;
        for (int i = n; i >= 0; i--) {
            count = count + buckets[i];
            if (count >= i) {
                return i;
            }
        }
        return 0;
    }
    public static int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
        int leftprod = 1;
        int rightprod = 1;

        for(int i=0;i<nums.length;i++){
            ans[i] = leftprod;
            leftprod *= nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i] = ans[i]*rightprod;
            rightprod *= nums[i];
        }
        printArray(ans);
        return ans;
    }
    static void printArray(int []nums){
        Arrays.stream(nums).forEach(e-> System.out.print(e +" "));

    }
}
