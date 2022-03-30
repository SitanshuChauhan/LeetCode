
//https://leetcode.com/problems/count-the-number-of-consistent-strings/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int i,j,k,t=0,c=0;
        for(i=0;i<words.length;i++){
            t=0;
            for(k=0;k<allowed.length();k++){
            for(j=0;j<words[i].length();j++)
                if(allowed.charAt(k)==words[i].charAt(j))
                    t++;
            }
            if(t==words[i].length())
                c++;
        }
        return c;
        
    }
}