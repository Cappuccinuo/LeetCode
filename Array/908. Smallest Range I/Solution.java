class Solution {
    public int smallestRangeI(int[] A, int K) {
        int N = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int num : A) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        return Math.max(max - min - 2 * K, 0);
    }
}

// During Contest
class Solution {
    public int smallestRangeI(int[] A, int K) {
        int N = A.length;
        if (A.length <= 1) {
            return 0;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
    
        int target = min + (max - min) / 2;
        
        for (int i = 0; i < N; i++) {
            A[i] = target - A[i] > 0 
                ? A[i] + Math.min(K, target - A[i]) 
                : target - A[i] == 0 
                    ? A[i] 
                    : A[i] - Math.min(K, A[i] - target);
        }
        
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        
        return max - min;
    }
}