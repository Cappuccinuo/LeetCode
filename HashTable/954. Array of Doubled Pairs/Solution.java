class Solution {
    public boolean canReorderDoubled(int[] A) {
        int len = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        
        Integer[] B = new Integer[len];
        for (int i = 0; i < len; i++) {
            B[i] = A[i];
        }
        
        Arrays.sort(B, Comparator.comparingInt(Math::abs));
        
        for (int i = 0; i < len; i++) {
            if (map.getOrDefault(B[i], 0) == 0) {
                continue;
            }
            
            if (map.getOrDefault(2 * B[i], 0) <= 0) {
                return false;
            }
            
            map.put(B[i], map.getOrDefault(B[i], 0) - 1);
            map.put(2 * B[i], map.getOrDefault(2 * B[i], 0) - 1);
        }
        
        return true;
    }
}