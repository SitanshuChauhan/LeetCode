//https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
       Stack<Character> a=new Stack<>();
        for(char ch: s.toCharArray()){
                if(ch=='(' || ch=='[' || ch=='{'|| ch=='<'){
                    a.push(ch);
                }
                
                if(ch==')' || ch==']' || ch=='}' || ch=='>'){
                    if(a.empty())
                         return false;
                    
                    char top=a.pop();
                    
                    if((ch==')' && top!='(') || (ch=='}' && top!='{')
                        || (ch==']' && top!='[') || (ch=='>' && top!='<'))
                         return false;
                        
                }
            }
            return a.empty();
    }
}