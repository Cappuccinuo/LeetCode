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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode front = queue.poll();
                if (i == size - 1) {
                    result.add(front.val);
                }
                if (front.left != null) {
                    queue.offer(front.left);
                }
                if (front.right != null) {
                    queue.offer(front.right);
                }
            }
        }
        
        return result;
    }
}

class Solution {
    int maxDepth;
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        maxDepth = -1;
        DFS(root, 0, result);
        return result;
    }
    
    private void DFS(TreeNode root, int depth, List<Integer> result) {
        if (root == null) {
            return;
        }
        
        if (depth > maxDepth) {
            result.add(root.val);
            maxDepth = depth;
        }
        DFS(root.right, depth + 1, result);
        DFS(root.left, depth + 1, result);
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        DFS(root, 0, map);
        int depth = 0;
        while (map.containsKey(depth)) {
            result.add(map.get(depth));
            depth++;
        }
        return result;
    }
    
    private void DFS(TreeNode root, int depth, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        
        map.put(depth, root.val);
        DFS(root.left, depth + 1, map);
        DFS(root.right, depth + 1, map);
    }
}