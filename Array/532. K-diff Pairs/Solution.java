class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int pre = 0;
        int post = 1;
        while (pre < nums.length && post < nums.length) {
            if (pre == post || nums[pre] + k > nums[post]) {
                post++;
            }
            else if (pre > 0 && nums[pre - 1] == nums[pre] || nums[pre] + k < nums[post]) {
                pre++;
            }
            else {
                count++;
                pre++;
                post++;
            }
        }
        return count;
    }
}

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            }
            else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}