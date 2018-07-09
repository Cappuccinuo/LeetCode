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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) {
            return root;
        }
        Map<TreeNode, Integer> map = new HashMap<>();
        return dfs(root, map, 1);
    }
    
    private TreeNode dfs(TreeNode root, Map<TreeNode, Integer> map, int depth) {
        if (root.left == null && root.right == null) {
            map.put(root, depth);
            return root;
        }
        if (root.left == null) {
            return dfs(root.right, map, depth + 1);
        }
        if (root.right == null) {
            return dfs(root.left, map, depth + 1);
        }
        TreeNode left = dfs(root.left, map, depth + 1);
        TreeNode right = dfs(root.right, map, depth + 1);
        if (map.get(left) == map.get(right)) {
            map.put(root, map.get(left));
            return root;
        }
        return map.get(left) > map.get(right) ? left : right;
    }
}