class Solution {
    private static int[] hours = new int[]{1, 2, 4, 8};
    private static int[] minutes = new int[]{1, 2, 4, 8, 16, 32};
    private List<String> result = new ArrayList<>();
    
    class Time {
        int hour;
        int min;
        Time (int h, int m) {
            this.hour = h;
            this.min = m;
        }
    }
    
    public List<String> readBinaryWatch(int num) {
        List<Time> times = new ArrayList<>();
        readBinaryWatchUtil(num, 0, 0, times, 0, 0);
        for (Time t : times) {
            String ans = String.format("%d:%02d", t.hour, t.min);
            result.add(ans);
        }
        return result;
    }
    
    private void readBinaryWatchUtil(int num, int hour, int min, List<Time> times, int count, int index) {
        if (num == count) {
            Time time = new Time(hour, min);
            times.add(time);
        }
        for (int i = index; i < hours.length + minutes.length; i++) {
            if (i < 6) {
                min += minutes[i];
            }
            else {
                hour += hours[i - 6];
            }
            if (min >= 60) {
                min -= minutes[i];
                continue;
            }
            if (hour >= 12) {
                hour -= hours[i - 6];
                continue;
            }
            readBinaryWatchUtil(num, hour, min, times, count + 1, i + 1);
            if (i < 6) {
                min -= minutes[i];
            }
            else {
                hour -= hours[i - 6];
            }
        }
        
    }
}