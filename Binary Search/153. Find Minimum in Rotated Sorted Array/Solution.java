// 2018.11.7
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        if (nums[start] < nums[end]) {
            return nums[start];
        }
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[start] < nums[mid]) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (nums[start] < nums[end]) {
            return nums[start];
        }
        return nums[end];
    }
}

// 2018.8.17
class Solution {
    public int findMin(int[] nums) {
        int N = nums.length;
        int start = 0;
        int end = N - 1;
        int target = nums[N - 1];
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (nums[start] < nums[end]) {
            return nums[start];
        }
        return nums[end];
    }
}


// 2018.4.26
class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int target = nums[nums.length - 1];
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                end = mid;   
            }
            else {
                start = mid;
            }
        }
        
        if (nums[start] <= target) {
            return nums[start];
        }
        else {
            return nums[end];
        }
    }
}