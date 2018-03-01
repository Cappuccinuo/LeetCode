/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
// Greedy start point
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        Arrays.sort(intervals, new myComparator());
        int removeCount = 0;
        int prev = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < intervals[prev].end) {
                if (intervals[i].end < intervals[prev].end) {
                    removeCount++;
                    prev = i;
                }
                else {
                    removeCount++;
                }
            }
            else {
                prev = i;
            }
        }
        return removeCount;
    }
    
    class myComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
    }
}
// Greedy end point
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        Arrays.sort(intervals, new myComparator());
        int removeCount = 0;
        int prev = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < intervals[prev].end) {
                removeCount++;
            }
            else {
                prev = i;
            }
        }
        return removeCount;
    }
    
    class myComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval i1, Interval i2) {
            return i1.end - i2.end;
        }
    }
}