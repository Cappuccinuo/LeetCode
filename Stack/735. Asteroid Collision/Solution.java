class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int ast : asteroids) {
            collision: {
                while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                    int real = -ast;
                    if (stack.peek() < real) {
                        stack.pop();
                        continue;
                    }
                    else if (stack.peek() == real) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(ast);
            }
        }
        
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}