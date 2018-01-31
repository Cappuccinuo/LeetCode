class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int result = 0;
        for (int i = 0; i < size - 1; i++) {
            int max_left = 0;
            int max_right = 0;
            for (int j = i; j >= 0; j--) { // Search the left part for max bar size
                max_left = Math.max(max_left, height[j]);
            }
            for (int j = i; j < size; j++) { // Search the right part for max bar size
                max_right = Math.max(max_right, height[j]);
            }
            result += Math.min(max_left, max_right) - height[i];
        }
        return result;
    }
}