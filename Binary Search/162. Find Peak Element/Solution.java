class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = nums.length - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1]) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (nums[start] > nums[end]) {
            return start;
        }
        return end;
    }
}