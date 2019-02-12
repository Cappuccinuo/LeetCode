class Solution {
    public TreeNode[] splitBST(TreeNode root, int V) {
        TreeNode[] result = new TreeNode[2];
        if (root == null) {
            return result;
        }
        
        TreeNode[] left = splitBST(root.left, V);
        TreeNode[] right = splitBST(root.right, V);
        
        if (root.val <= V) {
            root.right = right[0];
            return new TreeNode[]{root, right[1]};
        }
        else {
            root.left = left[1];
            return new TreeNode[]{left[0], root};
        }
    }
}