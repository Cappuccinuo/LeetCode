class MovingAverage {
    Queue<Integer> queue;
    int N;
    double sum;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        N = size;
        sum = 0.0;
    }
    
    public double next(int val) {
        if (queue.size() < N) {
            queue.offer(val);
            sum += val;
        }
        else {
            sum -= queue.poll();
            queue.offer(val);
            sum += val;
        }
        return sum / queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */

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

class MovingAverage {
    int[] array;
    int insert;
    int N;
    double sum;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        array = new int[size];
        N = 0;
        sum = 0.0;
        insert = 0;
    }
    
    public double next(int val) {
        if (N < array.length) {
            N++;
        }
        
        sum = sum - array[insert] + val;
        array[insert] = val;
        insert = (insert + 1) % array.length;
        
        return sum / N;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */