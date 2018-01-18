class Solution {
    public int minDistance(String word1, String word2) {
        if (word1.equals(word2)) {
            return 0;
        }
        return minDistanceHelper(word1, word2, word1.length(), word2.length());
    }
    
    private int minDistanceHelper(String word1, String word2, int index1, int index2) {
        int[][] dp = new int[index1 + 1][index2 + 1];
        for (int i = 0; i <= index1; i++) {
            for (int j = 0; j <= index2; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                else if (j == 0) {
                    dp[i][j] = i;
                }
                else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                }
            }
        }
        return dp[index1][index2];
    }
}