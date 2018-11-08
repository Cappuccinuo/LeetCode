// Sweep Line 2018.11.8
/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        // Write your code here
        List<Point> points = new LinkedList<>();
        for (Interval i : intervals) {
            points.add(new Point(i.start, 1));
            points.add(new Point(i.end, -1));
        }
        
        Collections.sort(points, new Comparator<Point>() {
           @Override 
            public int compare(Point p1, Point p2) {
                if (p1.time == p2.time) {
                    return p1.val - p2.val;
                }
                return p1.time - p2.time;
            }
        });
        
        int result = 0;
        int count = 0;
        for (Point p : points) {
            count += p.val;
            result = Math.max(count, result);
        }
        return result;
    }
    
    class Point {
        int time;
        int val;
        Point(int t, int v) {
            this.time = t;
            this.val = v;
        }
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