//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i,greatest=-1;
        ArrayList<Boolean> a = new ArrayList<Boolean>();
        for(i=0;i<candies.length;i++){
            if(candies[i]>greatest)
                greatest=candies[i];
        }
        for(i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=greatest)
                a.add(true);
            else
                a.add(false);
        }
        return a;
        
        
    }
}