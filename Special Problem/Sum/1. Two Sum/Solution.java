class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int numsLen = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int needSum = target - nums[i];
            if (map.containsKey(needSum)) {
                result[0] = map.get(needSum);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}