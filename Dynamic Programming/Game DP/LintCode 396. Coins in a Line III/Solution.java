public class Solution {
    /**
     * @param values: a vector of integers
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int[] values) {
        // write your code here
        int n = values.length;
        Pair[][] pairs = new Pair[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pairs[i][j] = new Pair(-1, -1);
            }
        }
        for (int i = 0; i < n; i++) {
            pairs[i][i] = new Pair(values[i], 0);
        }
        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (values[i] + pairs[i + 1][j].second > values[j] + pairs[i][j - 1].second) {
                    pairs[i][j].first = values[i] + pairs[i + 1][j].second;
                    pairs[i][j].second = pairs[i + 1][j].first;
                }
                else {
                    pairs[i][j].first = values[j] + pairs[i][j - 1].second;
                    pairs[i][j].second = pairs[i][j - 1].first;
                }
            }
        }
        
        return pairs[0][n - 1].first > pairs[0][n - 1].second;
    }
    
    class Pair {
        int first;
        int second;
        Pair (int f, int s) {
            this.first = f;
            this.second = s;
        }
    }
}