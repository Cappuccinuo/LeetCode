class Solution1 {
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

class Solution2 {
    public int rob(int[] nums) {
        int prevMax = 0;
        int currMax = 0;
        for (int num : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + num, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}