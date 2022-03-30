
//https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int i,j,w=0,pw=0;
        for(i=0;i<accounts.length;i++){
            for(j=0;j<accounts[i].length;j++){
                w+=accounts[i][j];
                }
            if(w>pw)
                pw=w;
            w=0;
            }
        return pw;
    }
}