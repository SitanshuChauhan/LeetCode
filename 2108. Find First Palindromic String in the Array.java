//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

class Solution {
    public String firstPalindrome(String[] words) {

        for(int i=0;i<words.length;i++){
            int t=0;
            for(int j=0,k=words[i].length()-1;j<words[i].length()/2;j++,k--){
                if(words[i].charAt(j)!=words[i].charAt(k))
                    break;
                else
                    t++;
            }
            if(t==words[i].length()/2)
                return words[i];
        }
        return "";
    }
}