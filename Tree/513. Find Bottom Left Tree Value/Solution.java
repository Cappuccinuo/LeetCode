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
    int height = 0;
    public int findBottomLeftValue(TreeNode root) {
        findHelper(root, 1);
        return result;
    }
    
    public void findHelper(TreeNode root, int depth) {
        if (height < depth) {
            result = root.val;
            height = depth;
        }
        if (root.left != null) {
            findHelper(root.left, depth + 1);
        }
        if (root.right != null) {
            findHelper(root.right, depth + 1);
        }
    }
}