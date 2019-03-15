class HitCounter {
    int[] time;
    int[] count;
    /** Initialize your data structure here. */
    public HitCounter() {
        time = new int[300];
        count = new int[300];
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        int index = timestamp % 300;
        if (time[index] != timestamp) {
            time[index] = timestamp;
            count[index] = 1;
        }
        else {
            count[index]++;
        }
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        int res = 0;
        int i;
        for (i = 0; i < 300; i++) {
            if (timestamp - time[i] < 300) {
                res += count[i];
            }
        }
        return res;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */