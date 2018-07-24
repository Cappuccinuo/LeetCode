class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int start = 1;
        int end = 1000000000;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (!canFinish(piles, H, mid)) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (canFinish(piles, H, start)) {
            return start;
        }
        return end;
    }
    
    private boolean canFinish(int[] piles, int H, int K) {
        int time = 0;
        for (int p : piles) {
            time += (p - 1) / K + 1;
        }
        return time <= H;
    }
}