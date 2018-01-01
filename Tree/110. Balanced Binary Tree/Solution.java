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
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        int diff = Math.abs(leftDepth - rightDepth);
        if (diff > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        return balanceCheckUtil(root) != -1;
    }
    
    public int balanceCheckUtil(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = balanceCheckUtil(root.left);
        if (left == -1) {
            return -1;
        }
        int right = balanceCheckUtil(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        } 
        return Math.max(left, right) + 1;
    }
}