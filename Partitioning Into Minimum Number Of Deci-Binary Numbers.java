//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

class Solution {
    public int minPartitions(String n) {
        int t=0;
        for(int i=0;i<n.length();i++){
            if(t<Character.getNumericValue(n.charAt(i)))
                t=Character.getNumericValue(n.charAt(i));
        }
        return t;
    }
}