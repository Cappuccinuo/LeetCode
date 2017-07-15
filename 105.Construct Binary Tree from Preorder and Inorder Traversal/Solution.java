public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(0, 0, inorder.length - 1, preorder, inorder);
    }
    
    public TreeNode createTree(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > inorder.length - 1 || inStart > inEnd) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = 0;
        
        while (inStart <= inEnd) {
            for (int i = inStart; i <= inEnd; i++) {
                if (inorder[i] == root.val) {
                    inIndex = i;
                }
            }
        }
        
        root.left = createTree(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = createTree(preStart + (inIndex - inStart) + 1, inIndex + 1, inEnd, preorder, inorder);
        return root;
    }
}
