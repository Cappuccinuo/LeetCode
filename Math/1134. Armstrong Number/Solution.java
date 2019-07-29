class Solution {
    public boolean isArmstrong(int N) {
        int count = digitCount(N);
        int sum = 0;
        int origin = N;
        while (N != 0) {
            int digit = N % 10;
            N = N / 10;
            sum += Math.pow(digit, count);
        }
        return sum == origin;
    }
    
    private int digitCount(int N) {
        String num = String.valueOf(N);
        return num.length();
    }
}