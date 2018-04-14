// 2018.4.11
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
    int prev = Integer.MIN_VALUE;
    boolean init = true;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        
        if (!init && (root.val <= prev)) {
            return false;
        }
        init = false;
        prev = root.val;
        
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }
}