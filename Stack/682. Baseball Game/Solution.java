class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String s : ops) {
            if (s.equals("C")) {
                stack.pop();
            }
            else if (s.equals("D")) {
                int num = stack.peek();
                stack.push(num * 2);
            }
            else if (s.equals("+")) {
                int top = stack.pop();
                int sumOfTwo = top + stack.peek();
                stack.push(top);
                stack.push(sumOfTwo);
            }
            else {
                int num = Integer.parseInt(s);
                stack.push(num);
            }
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}