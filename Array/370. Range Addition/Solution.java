// 2018.5.11
// Naive
class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] array = new int[length];
        for (int[] update : updates) {
            updateHelper(array, update[0], update[1], update[2]);
        }
        return array;
    }
    
    private void updateHelper(int[] array, int startIndex, int endIndex, int increment) {
        for (int i = startIndex; i <= endIndex; i++) {
            array[i] += increment;
        }
    }
}

// Advanced
class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        for (int[] update : updates) {
            int si = update[0];
            int ei = update[1];
            int inc = update[2];
            
            result[si] += inc;
            if (ei + 1 < length) {
                result[ei + 1] -= inc;
            }
        }
        
        for (int i = 1; i < length; i++) {
            result[i] += result[i - 1];
        }
        return result;
    }
}