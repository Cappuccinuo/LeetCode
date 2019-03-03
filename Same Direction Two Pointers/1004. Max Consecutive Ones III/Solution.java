class Solution {
    public int longestOnes(int[] A, int K) {
        int start = 0;
        int end = 0;
        int zero = K;
        int max = 0;
        int len = A.length;
        while (end < len) {
            int num = A[end];
            end++;
            if (num == 0) {
                zero--;
            }
            
            while (zero < 0) {
                int n = A[start];
                start++;
                if (n == 0) {
                    zero++;
                }
            }
            
            max = Math.max(max, end - start);
        }
        
        return max;
    }
}