
//https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
  int i=0,j=0,k=0;
        int []a=new int[nums1.length+nums2.length];
        while (i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j])
                a[k++]=nums1[i++];
        else
            a[k++]=nums2[j++];
        }
        while(i<nums1.length)
            a[k++]=nums1[i++];
        while(j<nums2.length)
            a[k++]=nums2[j++];
       
        if(a.length%2==0)
          return (double)(a[(a.length/2)-1]+ a[a.length/2])/2;
        else
           return (double)a[a.length/2];
    }
}