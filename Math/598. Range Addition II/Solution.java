class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int rowMin = m;
        int colMin = n;
        for (int i = 0; i < ops.length; i++) {
            rowMin = Math.min(rowMin, ops[i][0]);
            colMin = Math.min(colMin, ops[i][1]);
        }
        return rowMin * colMin;
    }
}