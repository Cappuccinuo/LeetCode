class Solution {
    public int nthUglyNumber(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        
        for (int i = 1; i < n; i++) {
            int next_val = Math.min(list.get(a) * 2, Math.min(list.get(b) * 3, list.get(c) * 5));
            list.add(next_val);
            a += (next_val == list.get(a) * 2) ? 1 : 0;
            b += (next_val == list.get(b) * 3) ? 1 : 0;
            c += (next_val == list.get(c) * 5) ? 1 : 0;
        }
        
        return list.get(list.size() - 1);
    }
}

class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.offer(1l);
        
        for (int i = 1; i < n; i++) {
            long num = pq.poll();
            
            while (!pq.isEmpty() && num == pq.peek()) {
                pq.poll();
            }
            
            pq.offer(num * 2);
            pq.offer(num * 3);
            pq.offer(num * 5);
        }
        
        return pq.poll().intValue();
    }
}