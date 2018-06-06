class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int h : hand) {
            if (!map.containsKey(h)) {
                map.put(h, 1);
            }
            else {
                map.replace(h, map.get(h) + 1);
            }
        }
        
        while (map.size() > 0) {
            int first = map.firstKey();
            for (int i = first; i < first + W; i++) {
                if (!map.containsKey(i)) {
                    return false;
                }
                if (map.get(i) == 1) {
                    map.remove(i);
                }
                else {
                    map.replace(i, map.get(i) - 1);
                }
            }
        }
        return true;
    }
}