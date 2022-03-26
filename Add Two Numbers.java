
//https://leetcode.com/problems/add-two-numbers/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode storeHead =new ListNode(0);
  ListNode l3=storeHead;
        int carry=0;
        while(l1!=null || l2!=null){
            int L1=(l1!=null)?l1.val:0;
            int L2=(l2!=null)?l2.val:0;
             
            int total=L1+L2+carry;
            carry=total/10;
            ListNode newNode=new ListNode(total%10);
            l3.next=newNode;
            l3=l3.next;
            if(l1!=null)
                l1=l1.next;
            
            if(l2!=null)
                l2=l2.next;
            

        }
        if(carry>0){
           ListNode newNode=new ListNode(carry);
            l3.next=newNode;
            l3=l3.next;
        }
        
        return storeHead.next;
}
}    
