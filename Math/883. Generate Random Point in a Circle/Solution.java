class Solution {
    double r, x, y;
    public Solution(double radius, double x_center, double y_center) {
        this.r = radius;
        this.x = x_center;
        this.y = y_center;
    }
    
    public double[] randPoint() {
        double xl = x - r;
        double yd = y - r;
        
        while (true) {
            double xr = xl + Math.random() * r * 2;
            double yu = yd + Math.random() * r * 2;
            
            if (Math.sqrt(Math.pow(xr - x, 2) + Math.pow(yu - y, 2)) <= r) {
                return new double[]{xr, yu};
            }
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */