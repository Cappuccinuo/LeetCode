class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = getArea(A, B, C, D);
        int area2 = getArea(E, F, G, H);
        
        int overlap = 0;
        int leftX = Math.max(A, E);
        int leftY = Math.max(B, F);
        int rightX = Math.min(C, G);
        int rightY = Math.min(D, H);
        if (rightX > leftX && rightY > leftY) {
            overlap = getArea(leftX, leftY, rightX, rightY);
        }
        
        return area1 + area2 - overlap;
    }
    
    private int getArea(int leftX, int leftY, int rightX, int rightY) {
        return (rightX - leftX) * (rightY - leftY);
    }
}