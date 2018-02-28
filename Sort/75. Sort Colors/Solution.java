class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] count = new int[3];
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < n; i++) {
            result[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }
}