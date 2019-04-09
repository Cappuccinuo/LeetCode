class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        
        if (x == z || y == z || x + y == z) {
            return true;
        }
        
        return z % GCD(x, y) == 0;
    }
    
    private int GCD(int x, int y) {
        if (x == 0) {
            return y;
        }
        if (y == 0) {
            return x;
        }
        if (x == y) {
            return x;
        }
        if (x > y) {
            return GCD(x - y, y);
        }
        return GCD(x, y - x);
    }
}