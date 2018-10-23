// O(mlogm + klogn)
public class Solution {
    /**
     * @param arrays: a list of array
     * @param k: An integer
     * @return: an integer, K-th largest element in N arrays
     */
    class Node {
        int i;
        int j;
        int val;
        Node(int i, int j, int val) {
            this.i = i;
            this.j = j;
            this.val = val;
        }
    } 
     
    public int KthInArrays(int[][] arrays, int k) {
        // write your code here
        PriorityQueue<Node> pq = new PriorityQueue<>(k, new Comparator<Node>(){
            @Override
            public int compare(Node n1, Node n2) {
                return n2.val - n1.val;
            }
        });
        
        int m = arrays.length;
        for (int i = 0; i < m; i++) {
            int n = arrays[i].length;
            if (n == 0) {
                continue;
            }
            Arrays.sort(arrays[i]);
            pq.offer(new Node(i, n - 1, arrays[i][n - 1]));
        }
        
        for (int i = 1; i < k; i++) {
            Node top = pq.poll();
            if (top.j > 0) {
                pq.offer(new Node(top.i, top.j - 1, arrays[top.i][top.j - 1]));
            }
        }
        
        return pq.poll().val;
    }
}
// O(n * m * logk)
public class Solution {
    /**
     * @param arrays: a list of array
     * @param k: An integer
     * @return: an integer, K-th largest element in N arrays
     */
    public int KthInArrays(int[][] arrays, int k) {
        // write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        int m = arrays.length;
        for (int i = 0; i < m; i++) {
            int n = arrays[i].length;
            for (int j = 0; j < n; j++) {
                if (pq.isEmpty() || pq.size() < k) {
                    pq.offer(arrays[i][j]);
                }
                else {
                    if (arrays[i][j] > pq.peek()) {
                        pq.poll();
                        pq.offer(arrays[i][j]);
                    }
                }
            }
        }
        return pq.poll();
    }
}