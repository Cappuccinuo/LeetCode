class MedianFinder {
    PriorityQueue<Double> maxHeap;
    PriorityQueue<Double> minHeap;
    /** initialize your data structure here. */
    public MedianFinder() {
        maxHeap = new PriorityQueue<Double>(new Comparator<Double>() {
            @Override
            public int compare(Double a, Double b) {
                return (int)(b - a);
            }
        });
        minHeap = new PriorityQueue<Double>();
    }
    
    public void addNum(int num) {
        if (maxHeap.size() == 0 || num < maxHeap.peek()) {
            maxHeap.offer((double)num);
        }
        else {
            minHeap.offer((double)num);
        }
        balance();
    }
    
    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2;
        }
        else {
            return maxHeap.peek();
        }
    }
    
    private void balance() {
        while (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
        while (minHeap.size() + 1 < maxHeap.size()) {
            minHeap.offer(maxHeap.poll());
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */