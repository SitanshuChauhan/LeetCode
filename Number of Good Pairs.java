//https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i,j,p=0;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
               if(nums[i]==nums[j] && i<j)
                   p++;
            }
            
        }
        return p;
    }
}