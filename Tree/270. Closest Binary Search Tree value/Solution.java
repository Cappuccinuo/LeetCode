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
    public int closestValue(TreeNode root, double target) {
        int minValue = root.val;
        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(minValue - target)) {
                minValue = root.val;
            }
            root = root.val > target ? root.left : root.right;
        }
        return minValue;
    }
}
class Solution {
    TreeNode closest;
    double closestDiff;
    public int closestValue(TreeNode root, double target) {
        closestDiff = Double.MAX_VALUE;
        dfs(root, target);
        return closest.val;
    }
    
    public void dfs(TreeNode root, double target) {
        if (root == null) {
            return;
        }
        dfs(root.left, target);
        if (Math.abs(target - root.val) < closestDiff) {
            closestDiff = Math.abs(target - root.val);
            closest = root;
        }
        else {
            return;
        }
        dfs(root.right, target);
    }
}