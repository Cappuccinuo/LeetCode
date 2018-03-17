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
    int result;
    public int countUnivalSubtrees(TreeNode root) {
        result = 0;
        countHelper(root);
        return result;
    }
    
    public boolean countHelper(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (countHelper(root.left) & countHelper(root.right)) {
            if (root.left != null && root.val != root.left.val) {
                return false;
            }
            if (root.right != null && root.val != root.right.val) {
                return false;
            }
            result++;
            return true;
        }
        return false;
    }
}