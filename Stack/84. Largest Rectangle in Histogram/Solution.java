class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        int len = heights.length;
        
        for (int i = 0; i <= len; i++) {
            int height = (i == len ? Integer.MIN_VALUE : heights[i]);
            
            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int index = stack.pop();
                int h = heights[index];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, h * w);
            }
            
            stack.push(i);
        }
        
        return max;
    }
}