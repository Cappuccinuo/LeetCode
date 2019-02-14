class Solution {
    public boolean isPossible(int[] nums) {
        PriorityQueue<Interval> pq = new PriorityQueue<Interval>(new Comparator<Interval>() {
           @Override
            public int compare(Interval i1, Interval i2) {
                if (i1.end == i2.end) {
                    return i1.length - i2.length;
                }
                return i1.end - i2.end;
            }
        });
        
        for (int num : nums) {
            while (!pq.isEmpty() && pq.peek().end + 1 < num) {
                if (pq.poll().length < 3) {
                    return false;
                }
            }
            if (pq.isEmpty() || num == pq.peek().end) {
                pq.offer(new Interval(num, num));
            }
            else if (num == pq.peek().end + 1) {
                pq.offer(new Interval(pq.poll().start, num));
            }
        }
        
        while (!pq.isEmpty()) {
            if (pq.poll().length < 3) {
                return false;
            }
        }
        return true;
    }
}

class Interval {
    int start;
    int end;
    int length;
    
    Interval (int s, int e) {
        this.start = s;
        this.end = e;
        this.length = e - s + 1;
    }
}