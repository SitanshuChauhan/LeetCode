//https://leetcode.com/problems/flipping-an-image/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int j,k=image[i].length-1;
            for(j=0;j<image[i].length;j++){
                if(j<k){
                int t=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=t;
                    
                k--;
                }
                if(image[i][j]==0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
                    
            }
        }
        return image;
    }
}