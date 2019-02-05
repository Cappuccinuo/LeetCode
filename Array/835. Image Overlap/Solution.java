class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int N = A.length;
        int[][] count = new int[2 * N + 1][2 * N + 1];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 1) {
                    for (int k = 0; k < N; k++) {
                        for (int l = 0; l < N; l++) {
                            if (B[k][l] == 1) {
                                count[k - i + N][l - j + N] += 1;
                            } 
                        }
                    }
                }
            }
        }
        
        int ans = 0;
        for (int[] val : count) {
            for (int y : val) {
                ans = Math.max(ans, y);
            }
        }
        return ans;
    }
}