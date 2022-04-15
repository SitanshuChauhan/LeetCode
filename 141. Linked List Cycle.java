//https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode slower) {
        if(slower == null)
            return false;
        ListNode faster = slower;
        do {
            if(slower.next == null || faster.next == null || faster.next.next == null)
                return false;
            slower = slower.next;
            faster = faster.next.next;
        }
        while(slower != faster);
        
        return true;
    }
}