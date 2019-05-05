// DP
class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] canJump = new boolean[len];
        canJump[len - 1] = true;
        for (int i = len - 1; i >= 0; i--) {
            int longestJump = Math.min(len - 1, nums[i] + i);
            for (int j = i + 1; j <= longestJump; j++) {
                if (canJump[j]) {
                    canJump[i] = true;
                    break;
                }
            }
        }
        return canJump[0];
    }
}

// Greedy
class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int furthest = nums[0];
        for (int i = 1; i < len; i++) {
            if (i <= furthest && nums[i] + i >= furthest) {
                furthest = nums[i] + i;
            }
        }
        return furthest >= len - 1;
    }
}