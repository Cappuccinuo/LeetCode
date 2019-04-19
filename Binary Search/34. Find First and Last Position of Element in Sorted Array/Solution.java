class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        result[0] = findTarget(nums, target, true);
        result[1] = findTarget(nums, target, false);
        return result;
    }
    
    private int findTarget(int[] nums, int target, boolean isFirst) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (isFirst) {
                    end = mid;   
                }
                else {
                    start = mid;
                }
            }
            else if (nums[mid] > target) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (isFirst) {
            if (nums[start] == target) {
                return start;
            }
            if (nums[end] == target) {
                return end;
            }
        }
        if (!isFirst) {
            if (nums[end] == target) {
                return end;
            }
            if (nums[start] == target) {
                return start;
            }
        }
        return -1;
    }
}