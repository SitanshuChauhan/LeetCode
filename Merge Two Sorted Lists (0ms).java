//https://leetcode.com/problems/merge-two-sorted-lists/

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       /*ListNode t1;
        int [] a=new int[100];
        int i=0;
        
        if(l1 == null && l2 == null)
            return null;
        else if(l1 != null && l2 == null)
            return l1;
        else if(l1 == null && l2 != null)
            return l2;
       
        else
        {
            t1=l1;
            while(t1.next!=null){
                a[i++]=t1.val;
                    t1=t1.next;
            }
            a[i++]=t1.val;
            t1.next=l2;
            
            while(t1!=null){
                a[i++]=t1.val;
                t1=t1.next;
            }
           
            
            t1=l1;
            for(int j=0;j<i-1;j++){
                 
                for(int k=j+1;k<i-1;k++){
                    int store=0;
                    if(a[j]>a[k]){
                        store=a[j];
                        a[j]=a[k];
                        a[k]=store;
                    }
                }
                t1.val=a[j];
                t1=t1.next;
            }
        
            return l1;*/
            
             ListNode t1 = new ListNode();
        ListNode merged = t1;
        int a[] = new int[100];
        int i = 0,j,k,least,store;
        
        if(l1 == null && l2 == null)
            return null;
        else if(l1 != null && l2 == null)
            return l1;
        else if(l1 == null && l2 != null)
            return l2;
        else{
            while(l1 != null){
                a[i++] = l1.val;
                l1 = l1.next;
            }
            while(l2 != null){
                a[i++] = l2.val;
                l2 = l2.next;
            } 
            for(j = 0;j < i;j++){
                least = j;
                for(k = j+1; k < i;k++){
                    if(a[least] > a[k])
                        least = k;
                }
                t1.next = new ListNode(a[least]);
                t1 = t1.next;
                store = a[least];
                a[least] = a[j];
                a[j] = store;
            }
        }
        return merged.next;
            
            
        }
    }
