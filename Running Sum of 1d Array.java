
//https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int i,ps=0;
       int a[] = new int[nums.length];

        for(i=0;i<nums.length;i++){
            a[i]=ps+nums[i];
            ps+=nums[i];
   
        }
        return a;
        
    }
}