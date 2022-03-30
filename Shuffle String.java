
//https://leetcode.com/problems/shuffle-string/

class Solution {
    public String restoreString(String s, int[] indices) {
        int i;
        char []a=s.toCharArray();
        for(i=0;i<indices.length;i++){
            a[indices[i]]=s.charAt(i);
        }
       
        return String.valueOf(a);
        }
}