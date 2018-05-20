class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int lx1 = rec1[0];
        int ly1 = rec1[1];
        int rx1 = rec1[2];
        int ry1 = rec1[3];
        int lx2 = rec2[0];
        int ly2 = rec2[1];
        int rx2 = rec2[2];
        int ry2 = rec2[3];
        
        if (lx1 >= rx2 || rx1 <= lx2) {
            return false;
        }
        
        if (ly1 >= ry2 || ry1 <= ly2) {
            return false;
        }
        
        return true;
    }
}