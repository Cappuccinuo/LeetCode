class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int len = A.length;
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < len; i++) {
            index.put(A[i], i);
        }
        
        Map<Integer, Integer> longest = new HashMap<>();
        int ans = 0;
        for (int k = 0; k < len; k++) {
            for (int j = 0; j < k; j++) {
                int i = index.getOrDefault(A[k] - A[j], -1);
                if (i >= 0 && i < j) {
                    int cand = longest.getOrDefault(i * len + j, 2) + 1;
                    longest.put(j * len + k, cand);
                    ans = Math.max(ans, cand);
                }
            }
        }
        return ans;
    }
}