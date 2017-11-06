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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        int diff = leftDepth - rightDepth;
        
        if (diff > 1 || diff < -1) {
            return false;
        }
        return isBalanced(root.right) && isBalanced(root.left);
    }
    
    public static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        
        return (leftDepth > rightDepth) ? (leftDepth + 1) : (rightDepth + 1);
    }
}