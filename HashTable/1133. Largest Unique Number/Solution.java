class Solution {
    public int largestUniqueNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = -1;
        for (int num : A) {
            if (map.get(num) == 1 && num > max) {
                max = num;
            }
        }
        return max;
    }
}