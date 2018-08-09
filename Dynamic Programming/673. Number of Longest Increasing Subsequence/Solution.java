class Solution {
    public int findNumberOfLIS(int[] nums) {
        int N = nums.length;

        int[] length = new int[N];
        int[] count = new int[N];
        Arrays.fill(count, 1);
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (length[i] <= length[j]) {
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    }
                    else if (length[i] == length[j] + 1) {
                        count[i] += count[j];
                    }
                }
            }
        }
        
        int longest = 0;
        int ans = 0;
        for (int len : length) {
            longest = Math.max(longest, len);
        }
        
        for (int i = 0; i < N; i++) {
            if (length[i] == longest) {
                ans += count[i];
            }
        }
        
        return ans;
    }
}