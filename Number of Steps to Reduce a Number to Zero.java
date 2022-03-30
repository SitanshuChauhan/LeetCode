
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps(int num) {
        int i;
         for(i=0;num>0;i++){
            
             if(num%2==0)
                num/=2;
             
             else
                num-=1;
        }
        return i;
    }
}