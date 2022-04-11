//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Solution {
    public int mostWordsFound(String[] sentences) {
    int max = 0;
    for(String s : sentences) {
    int space = 1;
    for(char ch : s.toCharArray()) {
        if(ch == ' ') {
          space++;
        }
      }

      if(space > max) {
        max = space;
      }
    }

    return max;
    }
}