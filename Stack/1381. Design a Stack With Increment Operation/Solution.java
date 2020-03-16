class CustomStack {
    Stack<Integer> stack;
    int maxSize;
    int[] inc;
    
    public CustomStack(int maxSize) {
        this.stack = new Stack<>();
        this.maxSize = maxSize;
        this.inc = new int[maxSize];
    }
    
    public void push(int x) {
        if (stack.size() == maxSize) {
            return;
        }
        stack.push(x);
    }
    
    public int pop() {
        if (stack.size() == 0) {
            return -1;
        }
        int currentIndex = stack.size() - 1;
        int top = stack.pop() + inc[currentIndex];
        if (currentIndex - 1 >= 0) {
            inc[currentIndex - 1] += inc[currentIndex];
        }
        inc[currentIndex] = 0;
        return top;
    }
    
    public void increment(int k, int val) {
        int i = Math.min(k, stack.size()) - 1;
        if (i >= 0) {
            inc[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */



class CustomStack {
    List<Integer> stack;
    int maxSize;
    
    public CustomStack(int maxSize) {
        this.stack = new ArrayList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if (stack.size() == maxSize) {
            return;
        }
        stack.add(x);
    }
    
    public int pop() {
        if (stack.size() == 0) {
            return -1;
        }
        int top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return top;
    }
    
    public void increment(int k, int val) {
        for (int i = 0; i < k && i < stack.size(); i++) {
            stack.set(i, val + stack.get(i)); 
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */