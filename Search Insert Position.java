//https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i,t=0;
        for(i=0;i<nums.length;i++)
            if(target<=nums[i]){
                t=i;
                break;
            }
        if(i==nums.length)
            return nums.length;
        return t; 
    }
}