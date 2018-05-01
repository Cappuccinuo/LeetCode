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
    int max;
    public int longestUnivaluePath(TreeNode root) {
        max = 0;
        univalueHelper(root);
        return max;
    }
    
    public int univalueHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = univalueHelper(root.left);
        int right = univalueHelper(root.right);
        int leftSub = 0;
        int rightSub = 0;
        if (root.left != null && root.left.val == root.val) {
            leftSub = left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            rightSub = right + 1;
        }
        max = Math.max(max, leftSub + rightSub);
        return Math.max(leftSub, rightSub);
    }
}