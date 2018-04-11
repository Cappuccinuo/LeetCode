// 2018.4.11

class MaxStack {
    Stack<Integer> stack;
    int max;
    /** initialize your data structure here. */
    public MaxStack() {
        stack = new Stack<>();
        max = Integer.MIN_VALUE;
    }
    
    public void push(int x) {
        if (x >= max) {
            stack.push(max);
            max = x;
        }
        stack.push(x);
    }
    
    public int pop() {
        int top = stack.pop();
        if (top == max) {
            max = stack.pop();
        }
        return top;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int peekMax() {
        return max;
    }
    
    public int popMax() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty() && stack.peek() != max) {
            temp.push(stack.pop());
        }
        int maximum = stack.pop();
        max = stack.pop();
        while (!temp.isEmpty()) {
            int num = temp.pop();
            if (num >= max) {
                stack.push(max);
                max = num;
            }
            stack.push(num);
        }
        return maximum;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */