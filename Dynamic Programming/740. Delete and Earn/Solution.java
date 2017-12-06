class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] values = new int[10001];
        for (int num : nums) {
            values[num] += num;
        }
        
        int currMax = 0;
        int prevMax = 0;
        
        for (int i = 0; i < values.length; i++) {
            int temp = currMax;
            currMax = Math.max(prevMax + values[i], currMax);
            prevMax = temp;
        }
        return currMax;
    }
}