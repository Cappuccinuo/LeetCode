class Solution {
    public boolean isHappy(int n) {
        int slow;
        int fast;
        slow = n;
        fast = n;
        do {
            slow = sumOfDigitsSquares(slow);
            fast = sumOfDigitsSquares(sumOfDigitsSquares(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int sumOfDigitsSquares(int n) {
        int x = n;
        int sum = 0;
        while (x != 0) {
            int digit = x % 10;
            sum += digit * digit;
            x = x / 10;
        }
        return sum;
    }
}