
//https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j;
        for(i=0;i<n;i++)
            nums1[i+m]=nums2[i];
                
        for(i=0;i<nums1.length;i++)
            for(j=1;j<nums1.length;j++){
                if(nums1[j-1]>nums1[j]){
                int t=nums1[j-1];
                nums1[j-1]=nums1[j];
                nums1[j]=t;
                }
            }
        for(i=0;i<n+m;i++)
            System.out.print(nums1[i]);
    }
}