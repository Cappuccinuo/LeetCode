// O(n)
public class Solution {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int increaseCount = 1;
        int decreaseCount = 1;
        int result = 1;
        int n = A.length;
        
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                increaseCount++;
                decreaseCount = 1;
            }
            else if (A[i] < A[i - 1]) {
                increaseCount = 1;
                decreaseCount++;
            }
            else {
                increaseCount = 1;
                decreaseCount = 1;
            }
            result = Math.max(result, Math.max(increaseCount, decreaseCount));
        }
        return result;
    }
}
// O(2n)
public class Solution {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int increaseCount = 1;
        int decreaseCount = 1;
        int n = A.length;
        
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                count++;
                increaseCount = Math.max(increaseCount, count);
            }
            else {
                count = 1;
            }
        }
        
        count = 1;
        for (int i = 1; i < n; i++) {
            if (A[i] < A[i - 1]) {
                count++;
                decreaseCount = Math.max(decreaseCount, count);
            }
            else {
                count = 1;
            }
        }
        return Math.max(increaseCount, decreaseCount);
    }
}