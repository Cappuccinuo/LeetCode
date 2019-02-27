class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        return findKthLargestHelper(nums, 0, len - 1, len - k + 1);
    }
    
    private int findKthLargestHelper(int[] nums, int start, int end, int k) {
        int pi = partition(nums, start, end);
        if (pi - start == k - 1) {
            return nums[pi];
        }
        else if (pi - start > k - 1) {
            return findKthLargestHelper(nums, start, pi - 1, k);
        }
        else {
            return findKthLargestHelper(nums, pi + 1, end, k - pi + start - 1);
        }
    }
    
    private int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int index = start - 1;
        int i;
        for (i = start; i < end; i++) {
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

class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        return pq.poll();
    }
}

