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
    int res = 0;
    public int longestConsecutive(TreeNode root) {
        helper(root);
        return res;
    }
    
    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int[] cur = new int[2];
        if (root.left != null) {
            if (root.left.val - 1 != root.val) {
                left[0] = 0;
            }
            if (root.left.val + 1 != root.val) {
                left[1] = 0;
            }
        }
        if (root.right != null) {
            if (root.right.val - 1 != root.val) {
                right[0] = 0;
            }
            if (root.right.val + 1 != root.val) {
                right[1] = 0;
            }
        }
        
        cur[0] = Math.max(left[0], right[0]) + 1;
        cur[1] = Math.max(left[1], right[1]) + 1;
        
        res = Math.max(res, Math.max(left[0] + right[1], left[1] + right[0]) + 1);
        
        return cur;
    }
}