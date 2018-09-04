class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        for (int[] m : matrix) {
            if (outOfBound(m, target)) {
                continue;
            }
            else {
                int result = binarySearch(m, target);
                if (result != -1) {
                    return true; 
                }
            }
        }
        
        return false;
    }
    
    private boolean outOfBound(int[] m, int target) {
        return m[0] > target || m[m.length - 1] < target;
    }
    
    private int binarySearch(int[] m, int target) {
        int start = 0;
        int end = m.length;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (m[mid] == target) {
                return mid;
            }
            else if (m[mid] < target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (m[start] == target) {
            return start;
        }
        if (m[end] == target) {
            return end;
        }
        return -1;
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

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;
        
        while (row >= 0 && col <= matrix[0].length - 1) {
            if (matrix[row][col] > target) {
                row--;
            }
            else if (matrix[row][col] < target) {
                col++;
            }
            else {
                return true;
            }
        }
        
        return false;
    }
}