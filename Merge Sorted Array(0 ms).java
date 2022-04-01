
//https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=0,j=0,k=0;
        int [] r=new int[m+n];
        while(i<m && j<n){
                if(nums1[i]<=nums2[j])
                    r[k++]=nums1[i++];
                else
                    r[k++]=nums2[j++];
            }
        while(j<n)
                r[k++]=nums2[j++];
        while(i<m)
                r[k++]=nums1[i++];
        
        
        
        for(i=0;i<r.length;i++)
            nums1[i]=r[i];
            
    }
}