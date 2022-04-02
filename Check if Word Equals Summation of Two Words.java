//https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int i,f=0,s=0,t=0;
        for(i=0;i<firstWord.length();i++){
            int p= firstWord.charAt(i) - 'a';
            f=f*10+p;
        }
        for(i=0;i<secondWord.length();i++){
            int p = secondWord.charAt(i) - 'a';
            s=s*10+p;
        }
        for(i=0;i<targetWord.length();i++){
            int p=targetWord.charAt(i) - 'a';
            t=t*10+p;
        }
        if((f+s)==t)
            return true;
        return false;
    }
}