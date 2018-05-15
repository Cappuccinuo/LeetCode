class Solution {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                pos = i;
                count++;
            }
        }
        if (count == 0) {
            return true;
        }
        if (count > 1) {
            return false;
        }
        return pos == 1 || pos == n - 1 || nums[pos - 2] <= nums[pos] || nums[pos - 1] <= nums[pos + 1];
    }
}