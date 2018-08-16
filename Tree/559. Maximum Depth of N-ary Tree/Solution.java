/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
//DFS
class Solution {
    int max;
    
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        max = 0;
        dfs(root, 1);
        return max;
    }
    
    private void dfs(Node node, int depth) {
        if (node == null) {
            return;
        }
        max = Math.max(max, depth);
        for (Node n : node.children) {
            dfs(n, depth + 1);
        }
    }
}


//BFS
class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        int depth = 0;
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                for (Node n : node.children) {
                    queue.offer(n);
                }
            }
            depth++;
        }
        
        return depth;
    }
}