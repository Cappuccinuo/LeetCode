class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        for (int num : nums) {
            moves += Math.abs(nums[nums.length / 2] - num);
        }
        return moves;
    }
}