class Solution {
    public boolean search(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}



class Solution {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }
            if (nums[mid] == target) {
                return true;
            }
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid;
                }
                else {
                    start = mid;
                }
            }
            else {
                if (target <= nums[end] && target > nums[mid]) {
                    start = mid;
                }
                else {
                    end = mid;
                }
            }
        }
        
        if (nums[start] == target) {
            return true;
        }
        
        if (nums[end] == target) {
            return true;
        }
        
        return false;
    }
}