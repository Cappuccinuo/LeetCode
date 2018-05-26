// 32ms
class Solution {
    public boolean verifyPreorder(int[] preorder) {
        Stack<Integer> stack = new Stack<>();
        int low = Integer.MIN_VALUE;
        
        for (int num : preorder) {
            if (num < low) {
                return false;
            }
            
            while (!stack.isEmpty() && num > stack.peek()) {
                low = stack.pop();
            }
            
            stack.push(num);
        }
        
        return true;
    }
}

// 3ms
class Solution {
    public boolean verifyPreorder(int[] preorder) {
        int low = Integer.MIN_VALUE;
        int index = -1;
        for (int num : preorder) {
            if (num < low) {
                return false;
            }
            
            while (index >= 0 && num > preorder[index]) {
                low = preorder[index--];
            }
            
            preorder[++index] = num;
        }
        return true;
    }
}