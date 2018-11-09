public class Solution {
    /**
     * @param nums: An array of integers
     * @return: An integer
     */
    public int maxProduct(int[] nums) {
        // write your code here
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        max[0] = nums[0];
        min[0] = nums[0];
        int result = max[0];
        for (int i = 1; i < n; i++) {
            max[i] = nums[i];
            min[i] = nums[i];
            if (nums[i] > 0) {
                max[i] = Math.max(max[i], max[i - 1] * nums[i]);
                min[i] = Math.min(min[i], min[i - 1] * nums[i]);
            }
            else {
                max[i] = Math.max(max[i], min[i - 1] * nums[i]);
                min[i] = Math.min(min[i], max[i - 1] * nums[i]);
            }
            result = Math.max(max[i], result);
        }
        return result;
    }
}

// 2018.10.19
class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int[] min = new int[len];
        int[] max = new int[len];
        
        min[0] = nums[0];
        max[0] = nums[0];
        
        int res = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] < 0) {
                swap(min, max, i - 1);
            }
            min[i] = Math.min(nums[i], nums[i] * min[i - 1]);
            max[i] = Math.max(nums[i], nums[i] * max[i - 1]);
            
            res = Math.max(res, max[i]);
        }
        
        return res;
    }
    
    private void swap(int[] min, int[] max, int i) {
        int temp = min[i];
        min[i] = max[i];
        max[i] = temp;
    }
}

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