
//https://leetcode.com/problems/decompress-run-length-encoded-list/

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int i,j,c=0;
        int []a=new int[10000];
        for(i=0;i<nums.length;i+=2){
            for(j=0;j<nums[i];j++){
               a[c++]=nums[i+1];
            }
        }
        int output[] = new int[c];
        for(i = 0;i < c;i++)
            output[i] = a[i];
        return output;
    }
}