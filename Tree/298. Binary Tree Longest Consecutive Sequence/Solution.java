// 2018.5.14
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
    int maxLength;
    
    public int longestConsecutive(TreeNode root) {
        maxLength = 0;
        DFS(root, null, 0);
        return maxLength;
    }
    
    private void DFS(TreeNode t, TreeNode parent, int length) {
        if (t == null) {
            return;
        }
        length = (parent != null && t.val == parent.val + 1) ? length + 1 : 1;
        maxLength = Math.max(maxLength, length);
        DFS(t.left, t, length);
        DFS(t.right, t, length);
    }
}

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
    public int longestConsecutive(TreeNode root) {
        return DFS(root, null, 0);
    }
    
    private int DFS(TreeNode current, TreeNode parent, int length) {
        if (current == null) {
            return length;
        }
        length = (parent != null && (parent.val + 1 == current.val)) ? length + 1 : 1;
        return Math.max(length, Math.max(DFS(current.left, current, length),
                                        DFS(current.right, current, length)));
    }
}