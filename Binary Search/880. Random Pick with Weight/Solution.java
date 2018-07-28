class Solution {
    List<Integer> sum = new ArrayList<>();
    int weightSum = 0;
    Random rand = new Random();
    
    public Solution(int[] w) {
        for (int num : w) {
            weightSum += num;
            sum.add(weightSum);
        }
    }
    
    public int pickIndex() {
        int target = rand.nextInt(weightSum);
        int lo = 0;
        int hi = sum.size() - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (target >= sum.get(mid)) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if (sum.get(lo) > target) {
            return lo;
        }
        return hi;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */