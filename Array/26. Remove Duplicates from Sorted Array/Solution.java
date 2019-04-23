class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        int index = 0;
        int len = nums.length;
        for (i = 1; i < len; i++) {
            if (nums[i] == nums[index]) {
                continue;
            }
            index++;
            swap(nums, i, index);
        }
        return index + 1;
    }
    
    private void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}