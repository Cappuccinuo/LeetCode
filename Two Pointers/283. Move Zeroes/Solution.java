// 3 ms
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        for (int currIndex = 0; currIndex < nums.length; currIndex++) {
            if (nums[currIndex] != 0) {
                swap(nums, lastNonZeroIndex++, currIndex);
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int prev = -1;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                if (prev == -1) {
                    prev = i;
                }
                while (i < nums.length - 1 && nums[i + 1] == 0) {
                    i++;
                }
                if (i == nums.length - 1) {
                    break;
                }
                swap(nums, prev, i + 1);
                prev++;
            }
        }
    }
    private void swap(int[] nums, int lo, int hi) {
        int temp = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = temp;
    }
}