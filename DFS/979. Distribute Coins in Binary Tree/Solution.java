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
    int result = 0;
    
    public int distributeCoins(TreeNode root) {
        DFS(root);
        return result;
    }
    
    private int DFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = DFS(root.left);
        int right = DFS(root.right);
        result += Math.abs(left) + Math.abs(right);
        return root.val + left + right - 1;
    }
}