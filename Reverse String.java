//https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        int t=s.length;
        for(int i=0;i<t/2;i++){
            char x=s[i];
            s[i]=s[t-i-1];
            s[t-i-1]=x;
            
        }
    }
}