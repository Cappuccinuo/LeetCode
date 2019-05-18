class Solution {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int len = A.length;
        int[] prefixSum = new int[len];
        prefixSum[0] = A[0];
        int i;
        for (i = 1; i < len; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        int lMax = prefixSum[L - 1];
        int mMax = prefixSum[M - 1];
        int res = prefixSum[L + M - 1];
        
        for (i = L + M; i < len; i++) {
            lMax = Math.max(lMax, prefixSum[i - M] - prefixSum[i - L - M]);
            mMax = Math.max(mMax, prefixSum[i - L] - prefixSum[i - L - M]);
            res = Math.max(res, Math.max(lMax + prefixSum[i] - prefixSum[i - M], mMax + prefixSum[i] - prefixSum[i - L]));
        }
        return res;
    }
}