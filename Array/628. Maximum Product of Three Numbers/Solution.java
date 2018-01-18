// 31 ms
class Solution {
    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[len - 1] * nums[0] * nums[1], nums[len - 1] * nums[len - 2] * nums[len - 3]);
    }
}

// 15 ms
class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num <= min2) {
                min2 = num;
            }
            if (num >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num >= max2) {
                max3 = max2;
                max2 = num;
            }
            else if (num >= max3) {
                max3 = num;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}