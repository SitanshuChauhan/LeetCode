//https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []alphabet=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            alphabet[ransomNote.charAt(i)-'a']++;
        }
        for(int j=0;j<magazine.length();j++){
            alphabet[magazine.charAt(j)-'a']--;
        }
        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]>0)
                return false;
        }
        return true;
    }
}