class MovingAverage {
    private int window;
    private Queue<Integer> q;
    private int sum;
    private int count;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.window = size;
        this.q = new LinkedList<>();
        this.sum = 0;
        this.count = 0; 
    }
    
    public double next(int val) {
        if (q.size() != this.window) {
            q.add(val);
            sum += val;
            count++;
            return (double)sum / count;
        }
        sum -= q.peek();
        q.remove(q.peek());
        q.add(val);
        sum += val;
        return (double)sum / this.window;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */