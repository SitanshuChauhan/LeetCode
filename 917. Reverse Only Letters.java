//https://leetcode.com/problems/reverse-only-letters/

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))){
                    ch[i]=s.charAt(j);
                    ch[j]=s.charAt(i);
                    i++;  
                    j--;
            }
            else{
                if(!Character.isLetter(s.charAt(i)))
                    i++;
                if(!Character.isLetter(s.charAt(j)))
                   j--; 
            }
                
        }
        return String.valueOf(ch);
    }
}