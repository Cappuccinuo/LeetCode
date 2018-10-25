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
    public void recoverTree(TreeNode root) {
        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            TreeNode top = stack.pop();
            if (prev != null) {
                if (first == null && top.val < prev.val) {
                    first = prev;
                }
                if (first != null && top.val < prev.val) {
                    second = top;
                }
            }
            prev = top;
            current = top.right;
        }
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}

class Solution {
    TreeNode first;
    TreeNode second;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        first = null;
        second = null;
        prev = null;
        inorderTraverse(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    
    private void inorderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.left);
        if (prev != null) {
            if (first == null && root.val < prev.val) {
                first = prev;
            }
            if (first != null && root.val < prev.val) {
                second = root;
            }
        }
        prev = root;
        inorderTraverse(root.right);
    }
}