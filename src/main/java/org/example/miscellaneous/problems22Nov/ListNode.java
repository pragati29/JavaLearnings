package org.example.miscellaneous.problems22Nov;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    static void print(ListNode l){
          ListNode currentNode=l;
        while (currentNode!=null){
            System.out.print(+currentNode.val+" ->");
            currentNode = currentNode.next;
        }
        System.out.println(" "+null);
    }
}
