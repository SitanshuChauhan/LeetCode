//https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] ops) {
        List <Integer> a=new ArrayList<>();
        for(String s: ops){
            if(s.equals("C"))
                a.remove(a.get(a.size()-1));
            
            else if(s.equals("D"))
                a.add(a.get(a.size()-1)*2);
            
            else if(s.equals("+"))
                a.add(a.get(a.size()-1)+a.get(a.size()-2));
                
            else
                a.add(Integer.parseInt(s));
                
        }
     int sum=0;
        for(int i=0;i<a.size();i++)
            sum+=a.get(i);
        return sum;
    }
}