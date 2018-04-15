/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet();
        for (int vertex : G) {
            set.add(vertex);
        }
        
        ListNode curr = head;
        int ans = 0;
        
        while (curr != null) {
            if (set.contains(curr.val) && (curr.next == null || !set.contains(curr.next.val))) {
                ans++;
            }
            curr = curr.next;
        }
        return ans;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        if (head == null) {
            return 0;
        }
        Set<Integer> hash = new HashSet();
        for (Integer i : G) {
            hash.add(i);
        }
        
        ListNode dummy = head;
        int steps = 0;
        while (dummy != null) {
            dummy = dummy.next;
            steps++;
        }
        
        UnionFind uf = new UnionFind(steps);
        int count = 0;
        for (int i = 0; i < G.length; i++) {
            count++;
        }
        uf.set_count(count);
        
        ListNode temp = head;
        ListNode prev = null;
        int index = 0;
        while (temp != null) {
            if (prev != null && hash.contains(prev.val) && hash.contains(temp.val)) {
                uf.union(index - 1, index);
            }
            prev = temp;
            temp = temp.next;
            index++;
        }
        return uf.query();
    }
}

class UnionFind {
    int[] father;
    int count;
    UnionFind(int n) {
        father = new int[n];
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
    }
    
    int find(int x) {
        if (father[x] == x) {
            return x;
        }
        return find(father[x]);
    }
    
    void union(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b) {
            father[root_a] = root_b;
            count--;
        }
    }
    
    void set_count(int total) {
        count = total;
    }
    
    int query() {
        return count;
    }
}