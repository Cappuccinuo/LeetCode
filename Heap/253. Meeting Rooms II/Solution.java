/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override 
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        
        PriorityQueue<Interval> time = new PriorityQueue<Interval>(intervals.length, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.end - i2.end;
            }
        });
        
        time.offer(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++) {
            Interval first = time.poll();
            if (intervals[i].start >= first.end) {
                first.end = intervals[i].end;
            }
            else {
                time.offer(intervals[i]);
            }
            time.offer(first);
        }
        
        return time.size();
    }
}

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        int len = intervals.length;
        int[] start = new int[len];
        int[] end = new int[len];
        
        for (int i = 0; i < len; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }
        
        int startIndex = 0;
        int endIndex = 0;
        Arrays.sort(start);
        Arrays.sort(end);
        int count = 0;
        for (int i = startIndex; i < len; i++) {
            if (start[i] < end[endIndex]) {
                count++;
            }
            else {
                endIndex++;
            }
        }
        return count;
    }
}