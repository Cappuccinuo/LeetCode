class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int len = nums.length;
        int firstPos = findFirstPosition(nums, target);
        int lastPos = findLastPosition(nums, target);
        if (firstPos != -1 && lastPos != -1) {
            return (lastPos - firstPos + 1) > len / 2;
        }
        return false;
    }
    
    private int findFirstPosition(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
    }
    
    private int findLastPosition(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (nums[end] == target) {
            return end;
        }
        if (nums[start] == target) {
            return start;
        }
        return -1;
    }
}