class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == nums[end]) {
                // If mid equals to end, that means it's fine to remove end
                // The smallest element won't be removed
                end--;
            }
            else if (nums[mid] < nums[end]) {
                end = mid;
            }
            else {
                start = mid;
            }
        }

        if (nums[start] < nums[end]) {
            return nums[start];
        }
        return nums[end];
    }
}