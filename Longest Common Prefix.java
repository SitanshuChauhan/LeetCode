
//https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
    int i,j,t=0,small=strs[0].length();
    String s="";
        for(i=0;i<strs.length;i++){
            if(small>strs[i].length())
                small=strs[i].length();
        }
        for(i=0;i<small;i++){
            t=0;
            for(j=0;j<strs.length;j++){
                if(strs[0].charAt(i)==strs[j].charAt(i))
                    t++;
                else{
                    i=small;
                    break;
                }
                }
            if(t==strs.length)
                    s+=strs[0].charAt(i);
            }
        return s;
    }
}