// Online algorithm, datastream
public class Solution {
    /**
     * @param k: An integer
     * @param nums: An integer array
     * @return: kth smallest element
     */
    public int kthSmallest(int k, int[] nums) {
        // write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int num : nums) {
            if (pq.isEmpty() || pq.size() < k) {
                pq.offer(num);
            }
            else {
                if (pq.peek() > num) {
                    pq.poll();
                    pq.offer(num);
                }
            }
        }
        return pq.poll();
    }
}
// Offline algorithm
public class Solution {
    /**
     * @param k: An integer
     * @param nums: An integer array
     * @return: kth smallest element
     */
    public int kthSmallest(int k, int[] nums) {
        // write your code here
        return quickSelect(nums, 0, nums.length - 1, k);
    }
    
    private int quickSelect(int[] nums, int start, int end, int k) {
        int pi = partition(nums, start, end);
        if (pi - start == k - 1) {
            return nums[pi];
        }
        else if (pi - start > k - 1) {
            return quickSelect(nums, start, pi - 1, k);
        }
        else {
            return quickSelect(nums, pi + 1, end, k - pi + start - 1);
        }
    }
    
    private int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int index = start - 1;
        for (int i = start; i < end; i++) {
            if (nums[i] < pivot) {
                index++;
                swap(nums, index, i);
            }
        }
        swap(nums, index + 1, end);
        return index + 1;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}