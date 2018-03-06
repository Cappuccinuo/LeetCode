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
    private int cursor;
    private int result;
    public int kthSmallest(TreeNode root, int k) {
        cursor = 1;
        inorder(root, k);
        return result;
    }
    
    public void inorder(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        inorder(root.left, k);
        if (cursor == k) {
            result = root.val;
        }
        cursor++;
        inorder(root.right, k);
    }
}