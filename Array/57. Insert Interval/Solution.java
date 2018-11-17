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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new LinkedList<>();
        int insertPos = 0;
        for (Interval interval : intervals) {
            if (interval.start > newInterval.end) {
                result.add(interval);
            }
            else if (interval.end < newInterval.start) {
                result.add(interval);
                insertPos++;
            }
            else {
                newInterval.start = Math.min(interval.start, newInterval.start);
                newInterval.end = Math.max(interval.end, newInterval.end);
            }
        }
        result.add(insertPos, newInterval);
        return result;
    }
}