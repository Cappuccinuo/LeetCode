class Solution {
    public int trap(int[] height) {
        int size = height.length;
        if (size == 0) {
            return 0;
        }
        int result = 0;
        int[] left_most = new int[size];
        int[] right_most = new int[size];
        left_most[0] = height[0];
        for (int i = 1; i < size; i++) {
            left_most[i] = Math.max(left_most[i - 1], height[i]);
        }
        right_most[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right_most[i] = Math.max(right_most[i + 1], height[i]);
        } 
        for (int i = 1; i < size - 1; i++) {
            result += Math.min(right_most[i], left_most[i]) - height[i];
        }
        return result;
    }
}

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