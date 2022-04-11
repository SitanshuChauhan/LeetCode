//https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode dummyCurrent = dummy;
        ListNode current = head;
        while(current != null){
            if(current.val != val){
                dummyCurrent.next = current;
                dummyCurrent = dummyCurrent.next;
            }
            current = current.next;
        }
        dummyCurrent.next = null;
        return dummy.next;
    }
}