// 2018.4.17
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i];
        }
        
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i == 0) {
                result[i] = right;
                break;
            }
            result[i] = right * result[i - 1];
            right = right * nums[i];
        }
        return result;
    }
}


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = right * result[i];
            right = right * nums[i];
        }
        return result;
    }
}