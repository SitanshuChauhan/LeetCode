//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i,j;
        int []a=new int[nums.length];
        for(i=0;i<nums.length;i++){
            int t=0;
            for(j=0;j<nums.length;j++){
                if(nums[i]>nums[j])
                    t++;
            }
            a[i]=t;
        }
        return a;
    }
}