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
// O(nlogn)
public class Solution {
    /**
     * @param airplanes: An interval array
     * @return: Count of airplanes are in the sky.
     */
    public int countOfAirplanes(List<Interval> airplanes) {
        // write your code here
        List<Point> points = new LinkedList<>();
        for (Interval i : airplanes) {
            points.add(new Point(i.start, 1));
            points.add(new Point(i.end, -1));
        }
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.index == p2.index) {
                    return p1.val - p2.val;
                }
                return p1.index - p2.index;
            }
        });
        int result = 0;
        int count = 0;
        for (Point p : points) {
            count += p.val;
            result = Math.max(result, count);
        }
        return result;
    }
    
    class Point {
        int index;
        int val;
        Point(int i, int v) {
            this.index = i;
            this.val = v;
        }
    }
}