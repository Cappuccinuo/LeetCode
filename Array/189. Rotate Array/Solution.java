class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }

        int n = nums.length;
        k = k % n;
        swapArray(nums, 0, n - k - 1);
        swapArray(nums, n - k, n - 1);
        swapArray(nums, 0, n - 1);
    }
    
    public void swapArray(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}