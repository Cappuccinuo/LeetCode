// 1 ms
class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] max = new int[len];
        int[] min = new int[len];
        max[0] = nums[0];
        min[0] = nums[0];
        for (int i = 1; i < len; i++) {
            max[i] = Math.max(Math.max(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
            min[i] = Math.min(Math.min(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
        }
        int result = nums[0];
        for (int i = 1; i < len; i++) {
            result = Math.max(result, max[i]);
        }
        return result;
    }
}

// 4 ms
class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        int[] max = new int[len];
        int[] min = new int[len];
        max[0] = nums[0];
        min[0] = nums[0];
        int result = nums[0];
        for (int i = 1; i < len; i++) {
            max[i] = Math.max(Math.max(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
            min[i] = Math.min(Math.min(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}

// 5 ms
class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < len; i++) {
            int prevMax = max;
            int prevMin = min;
            max = Math.max(Math.max(prevMax * nums[i], prevMin * nums[i]), nums[i]);
            min = Math.min(Math.min(prevMax * nums[i], prevMin * nums[i]), nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}

// 6 ms
class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] max = new int[len];
        int[] min = new int[len];
        max[0] = nums[0];
        min[0] = nums[0];
        for (int i = 1; i < len; i++) {
            max[i] = Math.max(Math.max(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
            min[i] = Math.min(Math.min(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
        }
        Arrays.sort(max);
        return max[len - 1];
    }
}