class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                }
                else {
                    ans += leftMax - height[left];
                }
                left++;
            }
            else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                }
                else {
                    ans += rightMax - height[right];
                }
                right--;
            }
        }
        return ans;
    }
}

class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int len = height.length;
        int ans = 0;
        boolean skip = false;
        for (int i = 0; i < len; i++) {
            int current = height[i];
            if (current == -1) {
                skip = true;
            }
            if (skip && current != -1 && current < height[stack.peek()]) {
                skip = false;
            }
            while (!stack.isEmpty() && current > height[stack.peek()]) {
                if (skip) {
                    break;
                }
                int topIndex = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int leftTop = stack.peek();
                int scope = i - leftTop - 1;
                int bound_height = Math.min(height[i], height[leftTop]) - height[topIndex];
                ans += bound_height * scope;
            }
            stack.push(i);
        }
        return ans;
    }
}

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