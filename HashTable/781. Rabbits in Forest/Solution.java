class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : answers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (int i : map.keySet()) {
            result += map.get(i) / (i + 1) * (i + 1);
            if (map.get(i) % (i + 1) != 0) {
                result += i + 1;
            }
        }
        return result;
    }
}