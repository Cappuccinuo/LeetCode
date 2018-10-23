class KthLargest {
    PriorityQueue<Integer> pq;
    int limit;
    
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(k);
        limit = k;
        for (int i = 0; i < nums.length; i++) {
            if (pq.size() < k) {
                pq.offer(nums[i]);
            }
            else if (pq.size() == k && nums[i] > pq.peek()) {
                pq.poll();
                pq.offer(nums[i]);
            }
        }
    }
    
    public int add(int val) {
        if (pq.size() < limit) {
            pq.offer(val);
        }
        else if (pq.size() == limit && val > pq.peek()) {
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

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