class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        
        while (inBound(i, j, m, n)) {
            int current = matrix[i][j];
            if (current > target) {
                j--;
            }
            else if (current < target) {
                i++;
            }
            else {
                return true;
            }
        }
        return false;
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        
        int dis = Math.min(matrix.length, matrix[0].length);
        
        for (int i = 0; i < dis; i++) {
            boolean vf = binarySearch(matrix, target, i, true);
            boolean hf = binarySearch(matrix, target, i, false);
            
            if (vf || hf) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean binarySearch(int[][] matrix, int target, int start, boolean vertical) {
        int lo = start;
        int hi = vertical ? matrix[start].length - 1 : matrix.length - 1;
        
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (vertical) {
                if (matrix[start][mid] == target) {
                    return true;
                }
                else if (matrix[start][mid] < target) {
                    lo = mid;
                }
                else {
                    hi = mid;
                }
            }
            else {
                if (matrix[mid][start] == target) {
                    return true;
                }
                else if (matrix[mid][start] < target) {
                    lo = mid;
                }
                else {
                    hi = mid;
                }
            }
        }
        
        if (vertical) {
            if (matrix[start][lo] == target) {
                return true;
            }
            if (matrix[start][hi] == target) {
                return true;
            }
        }
        else {
            if (matrix[lo][start] == target) {
                return true;
            }
            if (matrix[hi][start] == target) {
                return true;
            }
        }
        
        return false;
    }
}