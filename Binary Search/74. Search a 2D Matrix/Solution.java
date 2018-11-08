class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m * n - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            int current = matrix[mid / n][mid % n];
            if (current == target) {
                return true;
            }
            else if (current < target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (matrix[start / n][start % n] == target) {
            return true;
        }
        if (matrix[end / n][end % n] == target) {
            return true;
        }
        
        return false;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = matrix.length - 1;
        int j = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        
        while (inBound(i, j, m, n)) {
            if (matrix[i][j] == target) {
                return true;
            }
            else if (matrix[i][j] > target) {
                i--;
            }
            else {
                j++;
            }
        }
        return false;
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}