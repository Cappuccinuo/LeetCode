/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int findClosestLeaf(TreeNode root, int k) {
        Map<TreeNode, List<TreeNode>> graph = new HashMap<>();
        DFS(graph, root, null);
        
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet();
        
        for (TreeNode node : graph.keySet()) {
            if (node != null && node.val == k) {
                queue.offer(node);
                visited.add(node);
            }
        }
        
        while (!queue.isEmpty()) {
            TreeNode front = queue.poll();
            if (front != null) {
                if (graph.get(front).size() <= 1) {
                    return front.val;
                }
                for (TreeNode neighbor : graph.get(front)) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }
        return -1;
    }
    
    private void DFS(Map<TreeNode ,List<TreeNode>> graph, TreeNode node, TreeNode parent) {
        if (node != null) {
            if (!graph.containsKey(node)) {
                graph.put(node, new LinkedList<>());
            }
            if (!graph.containsKey(parent)) {
                graph.put(parent, new LinkedList<>());
            }
            graph.get(node).add(parent);
            graph.get(parent).add(node);
            DFS(graph, node.left, node);
            DFS(graph, node.right, node);
        }
    }
}