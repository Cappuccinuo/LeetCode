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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 && postorder.length == 0) {
            return null;
        }
        return buildTreeHelper(inorder, postorder, postorder.length - 1, 0, inorder.length - 1);
    }
    
    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int postIndex, int start, int end) {
        if (end < start) {
            return null;
        }
        int rootVal = postorder[postIndex];
        TreeNode root = new TreeNode(rootVal);
        
        int currentIndex = getCurrentIndex(inorder, rootVal);
        int leftNum = currentIndex - start;
        int rightNum = end - currentIndex;
        
        if (leftNum > 0) {
            root.left = buildTreeHelper(inorder, postorder, postIndex - rightNum - 1, start, currentIndex - 1);
        }
        if (rightNum > 0) {
            root.right = buildTreeHelper(inorder, postorder, postIndex - 1, currentIndex + 1, end);
        }
        
        return root;
    }
    
    private int getCurrentIndex(int[] inorder, int target) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }
}