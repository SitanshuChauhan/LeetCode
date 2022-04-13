////https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
    int slow = n;
	int fast = n;

	do {
		slow = getSumOfSquaresOfDigits(slow);
		fast = getSumOfSquaresOfDigits(getSumOfSquaresOfDigits(fast));
	} while (slow != fast);

	return slow == 1;
}


private int getSumOfSquaresOfDigits(int n) {
	int sum = 0;
	while (n != 0) {
		int digit = n % 10;
		sum += digit * digit;
		n /= 10;
	}
	return sum;
    }

}
