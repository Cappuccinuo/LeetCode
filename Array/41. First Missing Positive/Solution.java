class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        boolean hasOne = false;
        int i;
        // [3, 4, -1, -2, 0, 16, 5, 5, 1, 2]
        // len is 10, the max possible missing positive is 11
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // Trick: So we replace all the num smaller or equal to 0
        // Or larger than len 10 To 1
        
        // [3, 4, 1, 1, 1, 1, 5, 5, 1, 2]
        // The problem is that we need to first know if 1 exists in nums array
        
        // First traverse: 
        // 1. Check if 1 is in nums array
        // 2. Do the trick above
        for (i = 0; i < len; i++) {
            if (nums[i] == 1) {
                hasOne = true;
            }
            if (nums[i] <= 0 || nums[i] >= len + 1) {
                nums[i] = 1;
            }
        }
        
        // If we don't have one in array, return 1
        // Or if the len is 1 and we have one, we return 2
        if (!hasOne) {
            return 1;
        }
        if (hasOne && len == 1) {
            return 2;
        }

        // Second traverse:
        // As we need to figure out which positive number is missing
        // We make the number who has occured in the array negative
        // So array becomes 
        // [-3, -4, -1, -1, -1, -1, 5, 5, 1, 2]
        for (i = 0; i < len; i++) {
            int num = Math.abs(nums[i]) - 1;
            nums[num] = -Math.abs(nums[num]);
        }
        
        // Third traverse:
        // The missing positive number is the first number which is not negative
        for (i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        // Otherwise it is the max possible missing positive: len + 1
        return len + 1;
    }
}