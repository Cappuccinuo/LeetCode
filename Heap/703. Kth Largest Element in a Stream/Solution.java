class KthLargest {
    Queue<Integer> heap;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<Integer>();
        for (int num : nums) {
            heap.add(num);
        }
    }
    
    public int add(int val) {
        if (heap.size() < k || val > heap.peek()) {
            heap.add(val);
        }
        while (heap.size() > k) {
            heap.poll();
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */