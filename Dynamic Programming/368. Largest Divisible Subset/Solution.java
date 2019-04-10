class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new LinkedList<>();
        Arrays.sort(nums);
        int len = nums.length;
        int[] dp = new int[len];
        int[] delta = new int[len];
        Arrays.fill(dp, 1);
        int i, j;
        int max = 0;
        int maxIndex = -1;
        for (i = 0; i < len; i++) {
            delta[i] = i;
            for (j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        delta[i] = j;
                    }
                }
            }
            if (dp[i] > max) {
                max = dp[i];
                maxIndex = i;
            }
        }

        while (maxIndex != -1) {
            result.add(0, nums[maxIndex]);
            if (maxIndex == delta[maxIndex]) {
                return result;
            }
            maxIndex = delta[maxIndex];
        }

        return result;
    }
}