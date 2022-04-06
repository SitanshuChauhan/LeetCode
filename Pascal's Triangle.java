//https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> prevRow = new ArrayList<>();
        List<Integer> row;
        prevRow.add(1);
        output.add(prevRow);
        for(int i = 1; i < numRows; i++) {
            row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i; j++) {
                int element = prevRow.get(j-1) + prevRow.get(j);
                row.add(element);
            }
            row.add(1);
            output.add(row);
            prevRow = row;
        }
        return output;
        }
    }