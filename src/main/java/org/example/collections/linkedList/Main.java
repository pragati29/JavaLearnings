package org.example.collections.linkedList;

public class Main {

    public static void main(String[] args) {
        ListNode l1 =new ListNode(2);
        l1 = new ListNode(4,l1);
        l1 = new ListNode(3,l1);
        //l1.next=null;
        ListNode l2=new ListNode(5);
        l2 = new ListNode(6,l2);
        l2 =new ListNode(4,l2);
        addTwoNumber(l1,l2);
    }

    public static ListNode addTwoNumber(ListNode l1,ListNode l2){
        ListNode dummyHead= new ListNode(0);
        ListNode tail=dummyHead;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int d=l1!=null?l1.val:null;
            int d1=l2!=null?l2.val:null;
            int sum=d+d1+carry;
            int x=sum%10;
            carry=sum/10;
            ListNode c = new ListNode(x);
            tail.next=c;
            tail=tail.next;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        ListNode result = dummyHead.next;
        dummyHead = null;
        ListNode l3=new ListNode(0);

        System.out.println(result);
        return result;
    }
}
