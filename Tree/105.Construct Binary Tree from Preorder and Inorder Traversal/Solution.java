/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 2018.3.21
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return buildTreeHelper(preorder, inorder, 0, 0, preorder.length - 1);
    }
    
    public TreeNode buildTreeHelper(int[] preorder, int[] inorder, int preIndex, int start, int end) {
        if (start > end) {
            return null;
        }
        int val = preorder[preIndex];
        TreeNode root = new TreeNode(val);
        int rootIdx = getRootIndex(inorder, val);
        int leftNum = rootIdx - start;
        int rightNum = end - rootIdx;
        if (leftNum > 0) {
            root.left = buildTreeHelper(preorder, inorder, preIndex + 1, start, rootIdx - 1); 
        }
        if (rightNum > 0) {
            root.right = buildTreeHelper(preorder, inorder, preIndex + leftNum + 1, rootIdx + 1, end);
        }
        return root;
    }
    
    public int getRootIndex(int[] inorder, int target) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }
}



class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0) {
            return null;
        }
        return buildTreeHelper(preorder, inorder, 0, 0, inorder.length - 1);
    }
    
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int preIndex, int start, int end) {
        if (end < start) {
            return null;
        }
        int rootVal = preorder[preIndex];
        TreeNode root = new TreeNode(rootVal);
        
        int currentIndex = getCurrentIndex(inorder, rootVal);
        int leftNum = currentIndex - start;
        int rightNum = end - currentIndex;
        if (leftNum > 0) {
            root.left = buildTreeHelper(preorder, inorder, preIndex + 1, start, currentIndex - 1);
        }
        if (rightNum > 0) {
            root.right = buildTreeHelper(preorder, inorder, preIndex + leftNum + 1, currentIndex + 1, end);
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