//https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
        ListNode t=head;
        ListNode prev=null;
        ListNode next=null;
        ListNode LL2= new ListNode(t.val);
        ListNode t2=LL2;
        while(t!=null){
            next=t.next;
            t.next=prev;
            prev=t;
            t=next;
            
            if(next!=null){
            t2.next=new ListNode(next.val);
            t2=t2.next;
            }
        }
        t2.next=null;
        t2=LL2;
        while(prev!=null){
            if(prev.val==t2.val){
                prev=prev.next;
                t2=t2.next;
            }
            
            else
                return false;
        }
        return true;
        
    }
}