//https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length==r)
            return mat;
        if((mat.length*mat[0].length)!=(r*c))
            return mat;
        int[][]a=new int[r][c];
        int i=0,j=0;
        for(int n=0;n<mat.length;n++){
            for(int m=0;m<mat[0].length;m++){
                 if(j==c || i==r){
                    i++;
                    j=0;
                }   
                a[i][j]=mat[n][m];
                j++;
            }
        }
        return a;
    }
}