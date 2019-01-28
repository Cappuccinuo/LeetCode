class Solution {
    public int countTriplets(int[] A) {
        int N = 1 << 16;
        int[] dp = new int[N];
        
        for (int num : A) {
            for (int i = 0; i < N; i++) {
                if ((num & i) == 0) {
                    dp[i]++;
                }
            }
        }
        
        int ans = 0;
        
        for (int x : A) {
            for (int y : A) {
                ans += dp[x & y];
            }
        }
        
        return ans;
    }
}