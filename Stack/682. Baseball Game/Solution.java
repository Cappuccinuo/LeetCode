// 2018.4.10
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop();
            }
            else if (op.equals("D")) {
                int lastValid = stack.peek();
                stack.push(lastValid * 2);
            }
            else if (op.equals("+")) {
                int firstNum = stack.pop();
                int secondNum = stack.peek();
                int newNum = firstNum + secondNum;
                stack.push(firstNum);
                stack.push(newNum);
            }
            else {
                int num = Integer.valueOf(op);
                stack.push(num);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}


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