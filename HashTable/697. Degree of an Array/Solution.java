class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (left.get(num) == null) {
                left.put(num, i);
            }
            right.put(num, i);
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        int degree = Collections.max(count.values());
        int minLen = nums.length;
        for (Integer i : count.keySet()) {
            if (count.get(i) == degree) {
                minLen = Math.min(minLen, right.get(i) - left.get(i) + 1);
            }
        }
        return minLen;
    }
}