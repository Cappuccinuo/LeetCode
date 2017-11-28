class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int tailIndex = arrays.get(0).size() - 1;
        int max = arrays.get(0).get(tailIndex);
        int min = arrays.get(0).get(0);
        int res = 0;
        for (int i = 1; i < arrays.size(); i++) {
            tailIndex = arrays.get(i).size() - 1;
            int diff1 = Math.abs(max - arrays.get(i).get(0));
            int diff2 = Math.abs(arrays.get(i).get(tailIndex) - min);
            res = Math.max(res, Math.max(diff1, diff2));
            max = Math.max(max, arrays.get(i).get(tailIndex));
            min = Math.min(min, arrays.get(i).get(0));
        }
        return res;
    }
}