// m * n matrix -> O(nlogm)
public class Solution {
    /*
     * @param A: An integer matrix
     * @return: The index of the peak
     */
    public List<Integer> findPeakII(int[][] A) {
        // write your code here
        List<Integer> result = new LinkedList<>();
        if (A == null || A.length == 0 || A[0].length == 0) {
            return result;
        }
        int m = A.length;
        int n = A[0].length;
        
        int start = 1;
        int end = m - 2;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int rowMaxCol = findMaxCol(mid, A);
            int current = A[mid][rowMaxCol];
            if (current > A[mid - 1][rowMaxCol] && current > A[mid + 1][rowMaxCol]) {
                result.add(mid);
                result.add(rowMaxCol);
                return result;
            }
            else if (current < A[mid - 1][rowMaxCol]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return result;
    }
    
    private int findMaxCol(int row, int[][] A) {
        int col = 0;
        for (int j = 1; j < A[row].length; j++) {
            if (A[row][j] > A[row][col]) {
                col = j;
            }
        }
        return col;
    }
}

public class Solution {
    /*
     * @param A: An integer matrix
     * @return: The index of the peak
     */
    public List<Integer> findPeakII(int[][] A) {
        // write your code here
        List<Integer> result = new LinkedList<>();
        if (A == null || A.length == 0 || A[0].length == 0) {
            return result;
        }
        
        int row = A.length;
        int col = A[0].length;
        int start = 1;
        int end = row - 2;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            int maxCol = findMaxCol(mid, A);
            if (A[mid][maxCol] > A[mid - 1][maxCol] && A[mid][maxCol] > A[mid + 1][maxCol]) {
                result.add(mid);
                result.add(maxCol);
                return result;
            }
            else if (A[mid][maxCol] < A[mid - 1][maxCol]) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        int maxCol = findMaxCol(start, A);
        if (A[start][maxCol] > A[start - 1][maxCol] && A[start][maxCol] > A[start + 1][maxCol]) {
            result.add(start);
            result.add(maxCol);
            return result;
        }
        maxCol = findMaxCol(end, A);
        if (A[end][maxCol] > A[end - 1][maxCol] && A[end][maxCol] > A[end + 1][maxCol]) {
            result.add(end);
            result.add(maxCol);
            return result;
        }
        
        return result;
    }
    
    private int findMaxCol(int row, int[][] A) {
        int max = 0;
        for (int j = 1; j < A[0].length; j++) {
            if (A[row][j] > A[row][max]) {
                max = j;
            }
        }
        return max;
    }
}

// O(m + n)
public class Solution {
    /*
     * @param A: An integer matrix
     * @return: The index of the peak
     */
    public List<Integer> findPeakII(int[][] A) {
        // write your code here
        int m = A.length;
        int n = A[0].length;
        return findHelper(A, 1, m - 2, 1, n - 2);
    }
    
    private List<Integer> findHelper(int[][] A, int x1, int x2, int y1, int y2) {
        int mid1 = x1 + (x2 - x1) / 2;
        int mid2 = y1 + (y2 - y1) / 2;
        int peak = A[mid1][mid2];
        int x = mid1;
        int y = mid2;
        for (int i = x1; i <= x2; i++) {
            if (A[i][mid2] > peak) {
                peak = A[i][mid2];
                x = i;
                y = mid2;
            }
        }
        for (int j = y1; j <= y2; j++) {
            if (A[mid1][j] > peak) {
                peak = A[mid1][j];
                y = j;
                x = mid1;
            }
        }
        boolean isPeak = true;
        peak = A[x][y];
        if (peak < A[x - 1][y]) {
            isPeak = false;
            x -= 1;
        }
        else if (peak < A[x + 1][y]) {
            isPeak = false;
            x += 1;
        }
        else if (peak < A[x][y - 1]) {
            isPeak = false;
            y -= 1;
        }
        else if (peak < A[x][y + 1]) {
            isPeak = false;
            y += 1;
        }
        if (isPeak) {
            return new LinkedList<>(Arrays.asList(x, y));
        }
        
        if (x >= x1 && x < mid1 && y >= y1 && y < mid2) {
            return findHelper(A, x1, mid1 - 1, y1, mid2 - 1);
        }
        else if (x >= x1 && x < mid1 && y > mid2 && y <= y2) {
            return findHelper(A, x1, mid1 - 1, mid2 + 1, y2);
        }
        else if (x > mid1 && x <= x2 && y >= y1 && y < mid2) {
            return findHelper(A, mid1 + 1, x2, y1, mid2 - 1);
        }
        else if (x > mid1 && x <= x2 && y > mid2 && y <= y2) {
            return findHelper(A, mid1 + 1, x2, mid2 + 1, y2);
        }
        
        
        return new LinkedList<>(Arrays.asList(-1, -1));
    }
}