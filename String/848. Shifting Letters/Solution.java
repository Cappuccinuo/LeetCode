// 2018.6.10 During Contest
class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        char[] letters = S.toCharArray();
        int[] dp = new int[shifts.length];
        dp[shifts.length - 1] = shifts[shifts.length - 1] % 26;
        for (int i = shifts.length - 2; i >= 0; i--) {
            dp[i] += (dp[i + 1] + shifts[i]) % 26;
        }

        for (int i = 0; i < dp.length; i++) {
            dp[i] = dp[i] % 26;
            shiftHelper(letters, i, dp[i]);
        }
        return new String(letters);
    }
    
    private void shiftHelper(char[] array, int index, int shift) {
        if (outOfBound(array[index], shift)) {
            array[index] += shift - 26;
        }
        else {
            array[index] += shift;
        }
    }
    
    private boolean outOfBound(char c, int shift) {
        return c - 'a' + shift > 25;
    }
}