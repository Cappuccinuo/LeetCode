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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root != null) {
            searchBT(root, "", list);
        }
        return list;
    }
    
    public void searchBT(TreeNode root, String path, List<String> result) {
        if (root.left == null && root.right == null) {
            result.add(path + root.val);
        }
        if (root.left != null) {
            searchBT(root.left, path + root.val + "->", result);
        }
        if (root.right != null) {
            searchBT(root.right, path + root.val + "->", result);
        }
    }
}