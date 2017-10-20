class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int notrob = 0;
        for (int num : nums) {
            int robcurrent = notrob + num;
            notrob = Math.max(rob, notrob);
            rob = robcurrent;
        }
        return Math.max(rob, notrob);
    }
}