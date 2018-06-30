class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        
        int target = nums.length + 1;
        for (int i = 0; i < target; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        
        return -1;
    }
}