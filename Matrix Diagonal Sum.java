//https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0,j=mat.length-1;i<mat.length && j>-1;i++,j--){
            sum+=mat[i][i];
            
            if(i!=j)
                sum+=mat[j][i];
        }
        
        return sum;
    }
}