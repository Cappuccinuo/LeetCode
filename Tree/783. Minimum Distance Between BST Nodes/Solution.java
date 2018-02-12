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
    public int minDiffInBST(TreeNode root) {
        List<Integer> vals = inOrder(root);
        int minDis = Integer.MAX_VALUE;
        for (int i = 1; i < vals.size(); i++) {
            minDis = Math.min(minDis, vals.get(i) - vals.get(i - 1));
        }
        return minDis;
    }
    
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        return result;
    }
    
    public void inOrderHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inOrderHelper(root.left, result);
        result.add(root.val);
        inOrderHelper(root.right, result);
    }
}