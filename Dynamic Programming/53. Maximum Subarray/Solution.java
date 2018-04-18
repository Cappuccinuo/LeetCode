// 2018.4.18
class Solution {
    public int maxSubArray(int[] nums) {
        /*
        Divide-and-conquer method.
        The maximum summation of subarray can only exists under following conditions:
        1. the maximum summation of subarray exists in left half.
        2. the maximum summation of subarray exists in right half.
        3. the maximum summation of subarray exists crossing the midpoints to left and right. 
        1 and 2 can be reached by using recursive calls to left half and right half of the subarraies. 
        Condition 3 can be found starting from the middle point to the left,
        then starting from the middle point to the right. Then adds up these two parts and return. 

        T(n) = 2*T(n/2) + O(n)
        this program runs in O(nlogn) time
        */
        return subArraySum(nums, 0, nums.length - 1);
    }
    
    private int subArraySum(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int middle = left + (right - left) / 2;
        int leftSum = subArraySum(nums, left, middle);
        int rightSum = subArraySum(nums, middle + 1, right);
        int midSum = middleArraySum(nums, left, middle, right);
        if (leftSum >= rightSum && leftSum >= midSum) {
            return leftSum;
        }
        if (rightSum >= leftSum && rightSum >= midSum) {
            return rightSum;
        }
        return midSum;
    }
    
    private int middleArraySum(int[] nums, int left, int middle, int right) {
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = middle; i >= left; i--) {
            sum += nums[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        } 
        sum = 0;
        for (int j = middle + 1; j <= right; j++) {
            sum += nums[j];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }
}



class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            }
            else {
                sum += nums[i];
            }
            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }
}