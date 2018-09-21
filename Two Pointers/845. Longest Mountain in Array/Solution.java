class Solution {
    public int longestMountain(int[] A) {
        int N = A.length;
        int left = 0;
        int ans = 0;
        
        while (left < N) {
            int right = left;
            if (right + 1 < N && A[right] < A[right + 1]) {
                while (right + 1 < N && A[right] < A[right + 1]) {
                    right++;
                }
                if (right + 1 < N && A[right] > A[right + 1]) {
                    while (right + 1 < N && A[right] > A[right + 1]) {
                        right++;
                    }
                    if (right - left + 1 >= 3) {
                        ans = Math.max(right - left + 1, ans);
                    }
                }
            }
            left = Math.max(left + 1, right);
        }
        
        return ans;
    }
}