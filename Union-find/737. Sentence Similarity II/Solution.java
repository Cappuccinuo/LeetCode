class Solution {
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) {
            return false;
        }
        int len = pairs.length;
        UnionFind uf = new UnionFind(len * 2);
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        for (String[] pair : pairs) {
            if (!map.containsKey(pair[0])) {
                map.put(pair[0], index++);
            }
            if (!map.containsKey(pair[1])) {
                map.put(pair[1], index++);
            }
            
            uf.union(map.get(pair[0]), map.get(pair[1]));
        }
        int i;
        for (i = 0; i < words1.length; i++) {
            String w1 = words1[i];
            String w2 = words2[i];
            if (w1.equals(w2)) {
                continue;
            }
            if (!map.containsKey(words1[i]) || !map.containsKey(words2[i])) {
                return false;
            }
            if (uf.find(map.get(words1[i])) != uf.find(map.get(words2[i]))) {
                return false;
            }
        }
        return true;
    }
}

class UnionFind {
    int[] father;
    
    UnionFind(int n) {
        father = new int[n];
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
    }
    
    void union(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b) {
            father[root_a] = root_b;
        }
    }
    
    int find(int x) {
        if (father[x] == x) {
            return x;
        }
        Stack<Integer> stack = new Stack<>();
        while (father[x] != x) {
            stack.push(x);
            x = father[x];
        }
        while (!stack.isEmpty()) {
            father[stack.pop()] = x;
        }
        return x;
    }
}