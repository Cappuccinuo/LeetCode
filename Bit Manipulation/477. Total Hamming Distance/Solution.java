class Solution {
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bitmap = 1 << i;
            int onebit = 0;
            for (int num : nums) {
                if ((num & bitmap) != 0) {
                    onebit++;
                }
            }
            result += onebit * (nums.length - onebit);
        }
        return result;
    }
}