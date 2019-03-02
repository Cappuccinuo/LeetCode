class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points = {p1, p2, p3, p4};
        Arrays.sort(points, (pa, pb) -> (pa[0] == pb[0]) ? pa[1] - pb[1] : pa[0] - pb[0]);
        return dist(points[0], points[1]) > 0 && 
            dist(points[0], points[1]) == dist(points[1], points[3]) &&
            dist(points[1], points[3]) == dist(points[3], points[2]) && 
            dist(points[3], points[2]) == dist(points[3], points[1]) &&
            dist(points[1], points[2]) == dist(points[0], points[3]);
    }
    
    private int dist(int[] pa, int[] pb) {
        int deltaX = pa[0] - pb[0];
        int deltaY = pa[1] - pb[1];
        return deltaX * deltaX + deltaY * deltaY;
    }
}