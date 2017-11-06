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
	int depth = 1;
	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	queue.offer(root);
	while (!queue.isEmpty()) {
	    int size = queue.size();
	    for (int i = 0; i < size; i++) {
		TreeNode node = queue.poll();
	        if (node.left == null && node.right == null) {
		    return depth;
		}
		if (node.left != null) {
		    queue.offer(node.left);
		}
		if (node.right != null) {
		    queue.offer(node.right);
		}
	    }
	    depth++;
	}
	return depth;        
    }
}
