//https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int c=0;
            for(int j=0;j<points.length;j++){
                if((Math.pow((points[j][0]-queries[i][0]),2)+Math.pow((points[j][1]-queries[i][1]),2))<=Math.pow(queries[i][2],2))
                   c++;
               
        }
      answer[i]=c;             
    }
        return answer;
}
}