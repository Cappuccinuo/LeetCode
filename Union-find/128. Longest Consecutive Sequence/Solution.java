//HashSet:

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numDict = new HashSet();
        for (int num : nums) {
            numDict.add(num);
        }
        
        int current = 0;
        int longest = 0;
        for (int num : nums) {
            if (!numDict.contains(num - 1)) {
                int cnt = 0;
                current = num;
                while (numDict.contains(current)) {
                    cnt++;
                    current = current + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
//Union-Find:

class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int i;
        UnionFind uf = new UnionFind(len);
        for (i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                continue;
            }
            map.put(nums[i], i);
            if (map.containsKey(nums[i] + 1)) {
                uf.union(i, map.get(nums[i] + 1));
            }
            if (map.containsKey(nums[i] - 1)) {
                uf.union(i, map.get(nums[i] - 1));
            }
        }
        return uf.findLongest();
    }
}

class UnionFind {
    int[] father;
    int[] size;
    
    UnionFind(int N) {
        father = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            father[i] = i;
            size[i] = 1;
        }
    }
    
    void union(int a, int b) {
        int root_a = father[a];
        int root_b = father[b];
        if (root_a != root_b) {
            father[root_a] = root_b;
            size[find(root_b)] += size[root_a];
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
    
    int findLongest() {
        int max = 0;
        for (int s : size) {
            max = Math.max(s, max);
        }
        return max;
    }
}