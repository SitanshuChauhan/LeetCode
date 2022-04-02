
//https://leetcode.com/problems/first-missing-positive/

class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
        int i = 1;
        int L = nums.length;
        for(int j = 0;j < L;j++)
        {
            if(nums[j] <= 0)
                continue;
            if(nums[j] == i)
                i++;
            else if(nums[j] > i)
                break;
        }
        return i;
    }
}