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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        return constructBSTFromInorder(inorder, 0, inorder.size() - 1);
    }
    
    private TreeNode constructBSTFromInorder(List<Integer> inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(inorder.get(mid));
        root.left = constructBSTFromInorder(inorder, start, mid - 1);
        root.right = constructBSTFromInorder(inorder, mid + 1, end);
        return root;
    }
    
    private void inorderTraversal(TreeNode root, List<Integer> inorder) {
        if (root == null) {
            return;
        }
        
        inorderTraversal(root.left, inorder);
        inorder.add(root.val);
        inorderTraversal(root.right, inorder);
    }
}