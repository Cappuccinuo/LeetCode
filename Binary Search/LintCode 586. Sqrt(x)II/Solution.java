public class Solution {
    /**
     * @param x: a double
     * @return: the square root of x
     */
    public double sqrt(double x) {
        // write your code here
        double start;
        double end;
        if (x >= 1) {
            start = 1;
            end = x;
        }
        else {
            start = x;
            end = 1;
        }
        
        while (end - start > 1e-10) {
            double mid = start + (end - start) / 2;
            if (mid * mid > x) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        return start;
    }
}