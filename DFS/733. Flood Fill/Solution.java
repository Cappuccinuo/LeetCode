class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        floodFillOperation(image, sr, sc, oldColor, newColor);
        return image;
    }
    
    public void floodFillOperation(int[][] image, int sr, int sc, int oldColor, int newColor) {
        boolean inBound = sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length;
        if (inBound && image[sr][sc] != newColor && image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            floodFillOperation(image, sr + 1, sc, oldColor, newColor);
            floodFillOperation(image, sr - 1, sc, oldColor, newColor);
            floodFillOperation(image, sr, sc + 1, oldColor, newColor);
            floodFillOperation(image, sr, sc - 1, oldColor, newColor);
        }
    } 
}