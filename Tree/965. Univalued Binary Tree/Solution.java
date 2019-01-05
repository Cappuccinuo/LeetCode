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
    Integer val;
    boolean res;
    
    public boolean isUnivalTree(TreeNode root) {
        val = null;
        res = true;
        inorder(root);
        return res;
    }
    
    private void inorder(TreeNode root) {
        if (!res) {
            return;
        }
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (val != null && root.val != val) {
            res = false;
        }
        val = root.val;
        inorder(root.right);
    }
}