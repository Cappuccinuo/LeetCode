public class Solution {
    /**
     * @param A: an integer arrays sorted in ascending order
     * @param B: an integer arrays sorted in ascending order
     * @param k: An integer
     * @return: An integer
     */
    public int kthSmallestSum(int[] A, int[] B, int k) {
        // write your code here
        int m = A.length;
        int n = B.length;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = A[i] + B[j];
            }
        }
        return kthSmallestInSortedMatrix(matrix, k);
    }
    
    private int kthSmallestInSortedMatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = matrix[0][0];
        int end = matrix[m - 1][n - 1];
        while (start + 1 < end) {
            int mid = calculateMid(start, end);
            if (countEqualOrLess(matrix, mid) < k) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (countEqualOrLess(matrix, start) >= k) {
            return start;
        }
        return end;
    }
    
    private int calculateMid(int start, int end) {
        if (start > 0 || end < 0) {
            return start + (end - start) / 2;
        }
        else {
            return (start + end) / 2;
        }
    }
    
    private int countEqualOrLess(int[][] matrix, int value) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        int count = 0;
        for (int[] row : matrix) {
            while (j >= 0) {
                if (row[j] <= value) {
                    count += j + 1;
                    break;
                }
                else {
                    j--;
                }
            }
        }
        return count;
    }
}