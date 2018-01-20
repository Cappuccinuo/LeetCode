class Solution {
    public int findLHS(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer i : map.keySet()) {
            if (map.get(i + 1) != null) {
                count = Math.max(count, map.get(i) + map.get(i + 1));
            }
        }
        return count;
    }
}