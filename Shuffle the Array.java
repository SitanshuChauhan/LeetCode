
//https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i,j,k;
        int []a=new int[2*n];
        for(i=0,j=0,k=0;i<2*n;i++){
            if(i%2==0){
            a[i]=nums[j];
                j++;
            }
            else{
                a[i]=nums[k+n];
                k++;
            }
            
            
        }
        return a;
    }
}