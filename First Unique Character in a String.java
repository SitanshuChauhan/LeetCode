//https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            alphabet[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(alphabet[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}