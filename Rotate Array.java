//https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int newArr[] = new int[n];
        for(int i = 0; i < k; i++)
            newArr[i] = nums[i+(n-k)];
        for(int i = k; i < n; i++)
            newArr[i] = nums[i-k];
        for(int i = 0; i < n; i++)
            nums[i] = newArr[i];
       
    }
}