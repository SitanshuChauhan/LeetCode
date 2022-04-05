//https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      
        ArrayList <Integer> a=new ArrayList<>();
        if(nums1.length>nums2.length)
        for(int i=0;i<nums2.length;i++)
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    a.add(nums1[j]);
                    nums1[j]=-1;
                    break;
                }
            }
        else
        for(int i=0;i<nums1.length;i++)
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    a.add(nums2[j]);
                    nums2[j]=-1;
                    break;
                }
            }
        int []b=new int[a.size()];
        for(int i=0;i<a.size();i++)
            b[i]=a.get(i);

        
    return b;
}
}
