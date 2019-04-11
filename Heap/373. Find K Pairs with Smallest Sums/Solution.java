// Optimal
class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new LinkedList<>();
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override 
            public int compare(int[] a, int[] b) {
                int sum1 = a[0] + a[1];
                int sum2 = b[0] + b[1];
                return sum1 - sum2;
            }
        });
        int i;
        int j;
        for (i = 0; i < nums1.length; i++) {
            pq.offer(new int[]{nums1[i], nums2[0], 0});
        }
        List<int[]> result = new LinkedList<>();
        while (k-- > 0 && !pq.isEmpty()) {
            int[] top = pq.poll();
            result.add(new int[]{top[0], top[1]});
            if (top[2] + 1 < nums2.length) {
                pq.offer(new int[]{top[0], nums2[top[2] + 1], top[2] + 1});
            }
        }
        return result;
    }
}



class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new LinkedList<>();
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override 
            public int compare(int[] a, int[] b) {
                int sum1 = a[0] + a[1];
                int sum2 = b[0] + b[1];
                return sum1 - sum2;
            }
        });
        int i;
        int j;
        for (i = 0; i < nums1.length; i++) {
            for (j = 0; j < nums2.length; j++) {
                pq.offer(new int[]{nums1[i], nums2[j]});
            }
        }
        List<int[]> result = new LinkedList<>();
        while (!pq.isEmpty() && k-- > 0) {
            result.add(pq.poll());
        }
        return result;
    }
}


class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new LinkedList<>();
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override 
            public int compare(int[] a, int[] b) {
                int sum1 = a[0] + a[1];
                int sum2 = b[0] + b[1];
                return sum2 - sum1;
            }
        });
        int i;
        int j;
        for (i = 0; i < nums1.length; i++) {
            for (j = 0; j < nums2.length; j++) {
                pq.offer(new int[]{nums1[i], nums2[j]});
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }
        List<int[]> result = new LinkedList<>();
        while (!pq.isEmpty()) {
            result.add(0, pq.poll());
        }
        return result;
    }
}