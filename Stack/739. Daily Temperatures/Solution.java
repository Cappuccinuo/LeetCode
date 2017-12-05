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