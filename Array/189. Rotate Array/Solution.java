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

class Solution2 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }
    
    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}