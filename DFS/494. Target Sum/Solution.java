class Solution {
    int count;
    
    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        count = 0;
        int len = nums.length;

        DFS(nums, S, 0, 0);
        return count;
    }
    
    private void DFS(int[] nums, int S, int index, int currentSum) {
        if (index == nums.length) {
            if (currentSum != S) {
                return;
            }
            count++;
            return;
        }

        DFS(nums, S, index + 1, currentSum - nums[index]);
        DFS(nums, S, index + 1, currentSum + nums[index]);
    }
}