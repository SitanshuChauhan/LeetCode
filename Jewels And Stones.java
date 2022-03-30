//https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int i,j,t=0;
        for(i=0;i<jewels.length();i++){
            for(j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j))
                    t++;
            }
        }
        return t;
    }
}