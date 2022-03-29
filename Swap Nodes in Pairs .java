//https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
        ListNode h1=head;
        int store=0;
        if(head==null)
            return null;
        else if(head.next==null)
            return head;
        else
            while (h1!=null){
                if(h1.next==null)
                    break;
                else{
                  store = h1.val;
                h1.val=h1.next.val;
                h1.next.val=store;
                h1=h1.next.next;
                }
               }
        
        return head;
    }
}