//https://leetcode.com/problems/count-items-matching-a-rule/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int c = 0;
        int index;
        if(ruleKey.equals("type"))
            index=0;
        else if(ruleKey.equals("color"))
            index=1;
        else
            index=2;
        for(int i = 0;i < items.size();i++){
            if(items.get(i).get(index).equals(ruleValue))
                c++;}
        return c;
    }
}