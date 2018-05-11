// 2018.5.11
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                return (p1[0] == p2[0]) ? p1[1] - p2[1] : p2[0] - p1[0];     
            }
        });
        List<int[]> result = new LinkedList<>();
        for (int[] p : people) {
            result.add(p[1], p);
        }
        return result.toArray(new int[people.length][2]);
    }
}