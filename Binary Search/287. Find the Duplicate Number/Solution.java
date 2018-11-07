// Binary Search
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int start = 1;
        int end = n; 
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (countNumSmallerOrEqual(nums, mid) > mid) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (countNumSmallerOrEqual(nums, start) > start) {
            return start;
        }
        return end;
    }
    
    private int countNumSmallerOrEqual(int[] nums, int number) {
        int count = 0;
        for (int num : nums) {
            if (num <= number) {
                count++;
            }
        }
        return count;
    }
}

// Two Pointers slow and fast to find cycle
class Solution {
    public int findDuplicate(int[] nums) {
        // slow and fast pointer to prove that the nums array has cycle
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

// Two Pointers
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int numsLen = nums.length;
        int lo = 0;
        int hi = numsLen - 1;
        while (lo < hi) {
            if (nums[lo] == nums[lo + 1]) {
                return nums[lo];
            }
            if (nums[hi] == nums[hi - 1]) {
                return nums[hi];
            }
            lo++;
            hi--;
        }
        return -1;
    }
}