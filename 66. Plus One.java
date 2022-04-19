//https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n-1] += 1;
        int carry = 0;
        for(int i = n-1; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i]/10;
            digits[i] %= 10;
        }
        int output[];
        if(carry == 0)
            return digits;
        else {
            output = new int[n+1];
            output[0] = 1;
            for(int i = 1; i <= n; i++)
                output[i] = digits[i-1];
            return output;
        }
    }
}