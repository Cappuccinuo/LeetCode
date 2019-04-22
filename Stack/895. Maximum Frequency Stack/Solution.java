class FreqStack {
    int maxFreq;
    Map<Integer, Integer> freq;
    Map<Integer, Stack<Integer>> map;
    
    public FreqStack() {
        maxFreq = 0;
        freq = new HashMap<>();
        map = new HashMap<>();
    }
    
    public void push(int x) {
        int newFreq = freq.getOrDefault(x, 0) + 1;
        freq.put(x, newFreq);
        maxFreq = Math.max(maxFreq, newFreq);
        if (!map.containsKey(newFreq)) {
            map.put(newFreq, new Stack<>());
        }
        map.get(newFreq).push(x);
    }
    
    public int pop() {
        Stack<Integer> maxStack = map.get(maxFreq);
        int val = maxStack.pop();
        freq.put(val, maxFreq - 1);
        if (maxStack.isEmpty()) {
            map.remove(maxFreq);
            maxFreq--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */