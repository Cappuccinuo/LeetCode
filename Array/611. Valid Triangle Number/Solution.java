class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int i, j;
        int len = nums.length;
        int count = 0;
        // [2, 2, 3, 4]
        // i = 3
        // end = 3
        // a = 0, b = 2
        // sum = 5, diff = 1
        // true: count += 2 - 0 (2, 3, 4) and (2, 3, 4)
        // a = 0, b = 1
        // sum = 4, diff = 0
        // false
        // i = 2
        // end = 3
        // a = 0, b = 1
        // sum = 4, diff = 0
        // true: count += 1 - 0 (2, 2, 3)
    
        for (i = len - 1; i >= 2; i--) {
            int end = nums[i];
            int a = 0;
            int b = i - 1;
            while (a < b) {
                int sum = nums[a] + nums[b];
                int diff = nums[b] - nums[a];
                if (sum > end && diff < end) {
                    count += b - a;
                    b--;
                }
                else {
                    a++;
                }
            }
        }
        return count;
    }
}