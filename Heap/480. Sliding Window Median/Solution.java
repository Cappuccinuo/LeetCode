class Solution {
    PriorityQueue<Double> maxHeap;
    PriorityQueue<Double> minHeap;
    
    public double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        maxHeap = new PriorityQueue<>(len, Collections.reverseOrder());
        minHeap = new PriorityQueue<>(len);
        
        int i;
        List<Double> res = new ArrayList<>();
        
        if (k == 1) {
            for (int num : nums) {
                res.add((double)num);
            }
            double[] result = new double[res.size()];
            for (i = 0; i < res.size(); i++) {
                result[i] = res.get(i);
            }
            return result;
        }
        
        for (i = 0; i < k - 1; i++) {
            if (maxHeap.size() == 0 || maxHeap.peek() >= nums[i]) {
                maxHeap.offer((double)nums[i]);
            }
            else {
                minHeap.offer((double)nums[i]);
            }
        }
        
        balance();
        double currentMedian = maxHeap.peek();
        for (i = k - 1; i < len; i++) {
            if (nums[i] <= currentMedian) {
                maxHeap.offer((double)nums[i]);
            }
            else {
                minHeap.offer((double)nums[i]);
            }
            
            balance();
            
            if (k % 2 == 0) {
                currentMedian = (maxHeap.peek() + minHeap.peek()) / 2;
                
            }
            else {
                currentMedian = maxHeap.peek();
            }
            res.add(currentMedian);
            
            if (nums[i - k + 1] > maxHeap.peek()) {
                minHeap.remove((double)nums[i - k + 1]);
            }
            else {
                maxHeap.remove((double)nums[i - k + 1]);
            }
            balance();
        }
        
        double[] result = new double[res.size()];
        for (i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
    
    private void balance() {
        while (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
        while (minHeap.size() < maxHeap.size() - 1) {
            minHeap.offer(maxHeap.poll());
        }
    }
}