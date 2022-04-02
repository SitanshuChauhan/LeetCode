//https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {
     char[] a = s.toCharArray();
     int n = a.length;   
     int maxLen = 0;
     int maxI = 0;  
        for(int i = 0; i < n; i++){
            for(int t = 0; t <= 1; t++){
                int left = i;
                int right = i + t;
                while(left >= 0 && right < n && a[left] == a[right]){
                    left--;
                    right++;
                }
                left++;
                right--;
                int len = right - left + 1;
                if(len > maxLen){
                    maxLen = len;
                    maxI = left;
                }}}
        return s.substring(maxI, maxI + maxLen);
    }
}