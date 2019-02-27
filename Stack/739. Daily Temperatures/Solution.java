class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int len = temperatures.length;
        int[] result = new int[len];
        stack.push(0);
        for (int i = 1; i < len; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int temp = stack.pop();
                result[temp] = i - temp;
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            result[stack.pop()] = 0;
        }
        return result;
    }
}
// Faster
class Solution {
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) {
            return new int[0];
        }
        
        int len = T.length;
        int[] result = new int[len];
        int[] stack = new int[len];
        int top = -1;
        int i;
        for (i = 0; i < len; i++) {
            int temp = T[i];
            while (top > -1 && temp > T[stack[top]]) {
                int index = stack[top--];
                result[index] = i - index;
            }
            stack[++top] = i;
        }

        return result;
    }
}