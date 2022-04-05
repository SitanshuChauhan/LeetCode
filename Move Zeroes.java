//https://leetcode.com/problems/move-zeroes/class Solution {
  
    public void moveZeroes(int[] nums) {
        int t=nums.length-1;
        for(int i=nums.length-1;i>-1;i--){
            if(nums[i]==0){
                int j=i;
                while(j<nums.length-1){
                    nums[j]=nums[j+1];
                    j++;
                }
                    nums[t]=0;
                    t--;
            }
        }
    }
}