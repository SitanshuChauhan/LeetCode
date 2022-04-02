//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
    if(nums.length==1)
            return 1;
          int i,c=0;
        for(i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i])
                nums[c++]=nums[i-1];
            
            if(i==nums.length-1)
                nums[c++]=nums[i];    
        }
        return c;
    }
}