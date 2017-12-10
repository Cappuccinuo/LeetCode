class Solution1 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        List<Integer> result = new ArrayList<>();
        assignValue(nums, len - k, len, result);
        assignValue(nums, 0, len - k, result);
        for (int i = 0; i < len; i++) {
            nums[i] = result.get(i);
        }
    }
    
    public void assignValue(int[] nums, int l, int r, List<Integer> result) {
        for (int i = l; i < r; i++) {
            result.add(nums[i]);
        }
    }
}