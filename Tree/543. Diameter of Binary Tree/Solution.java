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
    public int diameterOfBinaryTree(TreeNode root) {
        max = 1;
        diameterHelper(root);
        return max - 1;
    }
    
    public int diameterHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = diameterHelper(root.left);
        int right = diameterHelper(root.right);
        max = Math.max(max, left + right + 1);
        return Math.max(left, right) + 1;
    }
}