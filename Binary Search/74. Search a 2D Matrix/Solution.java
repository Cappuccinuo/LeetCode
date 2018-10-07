class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int r = row - 1;
        int c = 0;
        
        while (r >= 0 && r < row && c >= 0 && c < col) {
            if (matrix[r][c] == target) {
                return true;
            }
            else if (matrix[r][c] < target) {
                c++;
            }
            else if (matrix[r][c] > target) {
                r--;
            }
        }
        
        return false;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        for (int i = matrix.length - 1; i >= 0; i--) {
            if (matrix[i][0] > target) {
                continue;
            }
            if (matrix[i][0] == target 
                || matrix[i][matrix[i].length - 1] == target) {
                return true;
            }
            if (binarySearch(matrix[i], target)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return true;
            }
            else if (array[mid] < target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (array[start] == target) {
            return true;
        }
        if (array[end] == target) {
            return true;
        }
        return false;
    }
}