class Solution {
    public int sumOfDigits(int[] A) {
        int minimum = findMin(A);
        int digitSum = getDigitSum(minimum);
        return digitSum % 2 == 0 ? 1 : 0;
    }
    
    private int findMin(int[] A) {
        int min = Integer.MAX_VALUE;
        for (int num : A) {
            min = Math.min(min, num);
        }
        return min;
    }
    
    private int getDigitSum(int minimum) {
        int sum = 0;
        while (minimum != 0) {
            sum += minimum % 10;
            minimum = minimum / 10;
        }
        return sum;
    }
}