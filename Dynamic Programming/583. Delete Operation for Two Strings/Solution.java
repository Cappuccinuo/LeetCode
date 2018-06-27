class Solution {
    public int minDistance(String word1, String word2) {
        int[][] distance = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0 || j == 0) {
                    continue;
                }
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    distance[i][j] = 1 + distance[i - 1][j - 1];
                }
                else {
                    distance[i][j] = Math.max(distance[i - 1][j], distance[i][j - 1]);
                }
            }
        }
        return word1.length() + word2.length() - 2 * distance[word1.length()][word2.length()];
    }
}

class Solution {
    public int minDistance(String word1, String word2) {
        int[][] distance = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0 || j == 0) {
                    distance[i][j] = i + j;
                }
                else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    distance[i][j] = distance[i - 1][j - 1];
                }
                else {
                    distance[i][j] = 1 + Math.min(distance[i - 1][j], distance[i][j - 1]);
                }
            }
        }
        return distance[word1.length()][word2.length()];
    }
}