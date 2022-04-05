//https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i = 1; i < n; i++)
            if(arr[max] < arr[i])
                max = i;
        return max;
    }
}