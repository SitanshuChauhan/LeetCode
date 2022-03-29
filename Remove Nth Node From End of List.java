
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode h1= head;
        int i,j;
        for(i = 0;h1 != null;i++)
        h1 = h1.next;
        h1 = head;
        if(i == 1)
        return null;
        else if(n == i)
        return head.next;
        for(j = 0;j < i-n-1;j++)
        {
             h1 = h1.next;
        }
        h1.next = h1.next.next;
        return head;
       
        
        }
    }
