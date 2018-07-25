class Solution {
    public int singleNonDuplicate(int[] nums) {
        int mask = 0;
        for (int num : nums) {
            mask = mask ^ num;
        }
        return mask;
    }
}