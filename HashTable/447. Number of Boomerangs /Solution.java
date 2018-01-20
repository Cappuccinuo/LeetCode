class Solution {
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int dis = distance(points[i][0], points[j][0], points[i][1], points[j][1]);
                if (map.containsKey(dis)) {
                    result += 2 * map.get(dis);
                }
                map.put(dis, map.getOrDefault(dis, 0) + 1);
            }
            map.clear();
        }
        return result;
    }
    
    private int distance(int x1, int x2, int y1, int y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }
}