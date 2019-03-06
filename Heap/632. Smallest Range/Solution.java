// O(nmlogn)
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<ResultSet> pq = new PriorityQueue<ResultSet>(new Comparator<ResultSet>() {
            @Override
            public int compare(ResultSet a, ResultSet b) {
                return a.val - b.val;
            }
        });
        int K = nums.size();
        int i;
        int max = 0;
        for (i = 0; i < K; i++) {
            int v = nums.get(i).get(0);
            pq.offer(new ResultSet(v, i, 0));
            max = Math.max(v, max);
        }
        int left = -1;
        int right = -1;
        int range = Integer.MAX_VALUE;
        while (pq.size() == K) {
            ResultSet min = pq.poll();
            if (max - min.val < range) {
                range = max - min.val;
                left = min.val;
                right = max;
            }
            
            if (min.col + 1 < nums.get(min.row).size()) {
                int v = nums.get(min.row).get(min.col + 1);
                pq.offer(new ResultSet(v, min.row, min.col + 1));
                max = Math.max(v, max);
            }
        }
        return new int[]{left, right};
    }
}

class ResultSet {
    int val;
    int row;
    int col;
    ResultSet(int v, int r, int c) {
        this.val = v;
        this.row = r;
        this.col = c;
    }
}