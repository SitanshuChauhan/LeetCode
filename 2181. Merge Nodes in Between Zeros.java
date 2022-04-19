//https://leetcode.com/problems/merge-nodes-in-between-zeros/

///**
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
    public ListNode mergeNodes(ListNode head) {
        ListNode t=head;
        ListNode t1=t;
        head=head.next;
        while(head!=null){
            if(head.val==0 && head.next!=null){
                t.next=head;
                t=t.next;
            }
            else{
                t.val+=head.val;
            }
            head=head.next;    
        }
        t.next=null;
        return t1;
    }
}