//https://leetcode.com/problems/rotate-list/

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;

        int i,n=0;
        ListNode t=head;
        while(t!=null){ 
            n++;
            t=t.next;
        }
        t=head;
        k =k % n;
        if(k==0)
            return head;

        while(k-- > 0)
            t = t.next;
        
        ListNode tHead = head;
        while(t.next != null){
            t = t.next;
            head = head.next;
        }
        ListNode newHead = head.next;
        t.next = tHead;
        head.next = null;
        return newHead;
    }
}