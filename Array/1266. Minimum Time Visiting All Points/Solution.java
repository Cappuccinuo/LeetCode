class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minDistance = 0;
        int len = points.length;
        for (int i = 0; i < len - 1; i++) {
            minDistance += minimumDistance(points[i], points[i + 1]);
        }
        return minDistance;
    }
    
    private int minimumDistance(int[] point1, int[] point2) {
        return Math.max(Math.abs(point1[0] - point2[0]), Math.abs(point1[1] - point2[1]));
    }
}