class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = A.length;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int sum = C[i] + D[j];
                count += map.getOrDefault(0 - sum, 0);
            }
        }
        return count;
    }
}