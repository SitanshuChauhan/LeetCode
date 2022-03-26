
//https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        int r=0,t=x;
        while(x!=0){
          r=(r*10)+(x%10);
              x/=10;
    }
        if(t==r && t>=0){
            return true;
}
        else{
            return false;
        }
}
}