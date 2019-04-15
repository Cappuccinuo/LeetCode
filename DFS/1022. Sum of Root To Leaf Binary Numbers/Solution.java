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
    int sum;
    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        DFS(root, 0);
        return sum;
    }
    
    private void DFS(TreeNode root, int current) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            current = (current << 1) | root.val;
            sum += current;
            return;
        }
        
        DFS(root.left, (current << 1) | root.val);
        DFS(root.right, (current << 1) | root.val);
    }
}