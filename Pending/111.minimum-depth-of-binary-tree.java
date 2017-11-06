/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
	if (root == null) {
	    return 0;
	}
	if (root.left == null && root.right == null) {
	    return 1;
	}        
	if (root.left == null) {
	    return minDepth(root.right) + 1;
	}
	if (root.right == null) {
	    return minDepth(root.left) + 1;
	}
	else {
	    return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
	}
    }
}
