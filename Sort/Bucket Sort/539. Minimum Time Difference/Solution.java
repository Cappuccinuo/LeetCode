class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] bucket = new boolean[24 * 60];
        
        int min = Integer.MAX_VALUE;
        for (String time : timePoints) {
            int total = getMinute(time);
            if (bucket[total]) {
                return 0;
            }
            bucket[total] = true;
        }

        int prev = -1;
        int first = -1;
        int i;
        int len = bucket.length;
        for (i = 0; i < len; i++) {
            if (!bucket[i]) {
                continue;
            }
            if (prev == -1) {
                first = i;
            }
            else {
                min = Math.min(min, i - prev);
            }
            prev = i;
        }
        min = Math.min(min, first + 24 * 60 - prev);

        return min;
    }
    
    private int getMinute(String str) {
        String[] sp = str.split(":");
        int hour = Integer.parseInt(sp[0]);
        int min = Integer.parseInt(sp[1]);
        return hour * 60 + min;
    }
}