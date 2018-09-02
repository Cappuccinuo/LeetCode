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
    TreeNode prev = null;
    
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        prev = dummy;
        DFS(root);
        return dummy.right;
    }
    
    private void DFS(TreeNode root) {
        if (root == null) {
            return;
        }
        DFS(root.left);
        root.left = null;
        prev.right = root;
        prev = root;
        DFS(root.right);
    }
}