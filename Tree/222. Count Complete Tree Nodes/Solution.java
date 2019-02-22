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
    public int countNodes(TreeNode root) {
        int leftDepth = getLeftDepth(root);
        int rightDepth = getRightDepth(root);
        if (leftDepth == rightDepth) {
            return (1 << leftDepth) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    
    private int getLeftDepth(TreeNode root) {
        TreeNode temp = root;
        int depth = 0;
        while (temp != null) {
            depth++;
            temp = temp.left;
        }
        return depth;
    }
    
    private int getRightDepth(TreeNode root) {
        TreeNode temp = root;
        int depth = 0;
        while (temp != null) {
            depth++;
            temp = temp.right;
        }
        return depth;
    }
}