class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        int end = 0;
        int ans = nums.length + 1;
        int currentSum = 0;
        
        while (start < nums.length) {
            while (end < nums.length && currentSum < s) {
                currentSum += nums[end];
                end++;
            }
            
            if (currentSum >= s) {
                ans = Math.min(ans, end - start);
            }
            
            currentSum -= nums[start];
            start++;
        }
        
        return ans == nums.length + 1 ? 0 : ans;
    }
}

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        int end = 0;
        int ans = nums.length + 1;
        int currentSum = 0;
        
        while (end < nums.length) {
            currentSum += nums[end];
            end++;
            
            while (currentSum >= s) {
                ans = Math.min(ans, end - start);
                currentSum -= nums[start];
                start++;
            }
        }
        
        return ans == nums.length + 1 ? 0 : ans;
    }
}

// O(nlogn)
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        int[] prefixSum = new int[len + 1];
        int ans = len + 1;
        for (int i = 1; i <= len; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        
        for (int i = 0; i < len; i++) {
            int targetClosestIndex = binarySearch(prefixSum, i + 1, len, prefixSum[i] + s);
            if (targetClosestIndex > len) {
                break;
            }

            ans = Math.min(ans, targetClosestIndex - i);
        }
        
        return ans == len + 1 ? 0 : ans;
    }
    
    private int binarySearch(int[] prefixSum, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (prefixSum[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}