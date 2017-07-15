public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return createTree(postorder.length - 1, 0, inorder.length - 1, inorder, postorder);
    }
    
    public TreeNode createTree(int postStart, int inStart, int inEnd, int[] inorder, int[] postorder) {
        if (postStart < 0 || inStart > inEnd) {
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[postStart]);
        int inIndex = 0;
        
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
            }
        }
        
        root.left = createTree(postStart - (inEnd - inIndex) - 1, inStart, inIndex - 1, inorder, postorder);
        root.right = createTree(postStart - 1, inIndex + 1, inEnd, inorder, postorder);
        return root;
    }
}
