class Solution {
    public int smallestRangeII(int[] A, int K) {
        int N = A.length;
        Arrays.sort(A);
        int max = A[N - 1];
        int min = A[0];
        int ans = max - min;
        
        for (int i = 0; i < N - 1; i++) {
            int a = A[i];
            int b = A[i + 1];
            max = Math.max(a + K, A[N - 1] - K);
            min = Math.min(b - K, A[0] + K);
            ans = Math.min(ans, max - min);
        }
        
        return ans;
    }
}