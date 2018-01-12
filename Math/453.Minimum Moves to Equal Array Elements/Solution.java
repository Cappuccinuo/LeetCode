//11ms
class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
        }
        for (int i = 0; i < nums.length; i++) {
            count += nums[i] - min;
        }
        return count;
    }
}
//42ms
class Solution {
    public int minMoves(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            count = nums[i] - nums[0] + count;
        }
        return count;
    }
}