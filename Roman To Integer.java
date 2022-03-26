
//https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        if(1 <= s.length() && s.length() <= 15){
        char []t=s.toCharArray();
        int i,j,total=0,minus=0;
        char []symbol={'I','V','X','L','C','D','M'};
        int []values={1,5,10,50,100,500,1000};
        int []romantoint =new int[s.length()];
        for(i=0;i<s.length();i++)
            for(j=0;j< symbol.length;j++)
                if(t[i]==symbol[j]){
                    romantoint[i]=values[j];
                }

        for(i=romantoint.length-1,j=romantoint.length-2;i>0 && j>-1;i--,j--)
            if(romantoint[i]>romantoint[j]){
                    minus+=romantoint[j];
            }
        for(i=0;i<romantoint.length;i++){
            total+=romantoint[i];
        }

        return (total-(2*minus));
    }
        else{
            return 0;
        }
    }
}