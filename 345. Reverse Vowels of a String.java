//https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    public String reverseVowels(String s) {
        char [] ch=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(CheckVowel(s.charAt(i)) && CheckVowel(s.charAt(j))){
                ch[i]=s.charAt(j);
                ch[j]=s.charAt(i);
                i++;
                j--;
            }
            else{
                if(!CheckVowel(s.charAt(i)))
                    i++;
                if(!CheckVowel(s.charAt(i)))
                    j--;
            }
        }
        return String.valueOf(ch);
    }
     public boolean CheckVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
          c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
            return true;
        }
        return false;

     }
}