package org.example.miscellaneous.problems22Nov;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // System.out.println(twoSum(new int[]{2,6,4,8},10)[1]);
        ListNode l1= new ListNode(1);
        ListNode l2=new ListNode(3,l1);
        ListNode l3= new ListNode(4,l2);
        ListNode l4= new ListNode(1);
        ListNode l5= new ListNode(8,l4);
        ListNode l6= new ListNode(9,l5);

        l1.print(l3);
        l1.print(l6);
       ListNode l7 = addTwoNumbers(l3,l6);
       l7.print(l7);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i< nums.length;i++){
            int x=target-nums[i];
            if(hm.containsKey(x)){
                return new int[]{i,hm.get(x)};
            }
        }
        return new int[2];
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int d1=l1!=null?l1.val:0;
            int d2=l2!=null?l2.val:0;
            int sum =d1+d2+carry;
            int digit=sum%10;
            carry=sum/10;

            ListNode newN=new ListNode(digit);
            tail.next=newN;
            tail=tail.next;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;

        }
        ListNode result=dummy.next;
        dummy.next=null;
        return result;
    }


}
