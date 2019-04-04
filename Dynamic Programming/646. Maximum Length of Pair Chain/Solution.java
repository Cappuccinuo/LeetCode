class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        
        int i, j;
        int len = pairs.length;
        int ans = 1;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (i = 1; i < len; i++) {
            for (j = 0; j < i; j++) {
                if (pairs[j][1] < pairs[i][0]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                    ans = Math.max(ans, dp[i]);
                }
            }
        }
        
        return ans;
    }
}

class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> (a[1] - b[1]));
        
        int current = Integer.MIN_VALUE;
        int ans = 0;
        for (int[] pair : pairs) {
            if (pair[0] > current) {
                ans++;
                current = pair[1];
            }
        }
        
        return ans;
    }
}