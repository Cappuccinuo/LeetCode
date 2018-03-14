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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        findLeavesHelper(root, list);
        return list;
    }
    
    public int findLeavesHelper(TreeNode root, List<List<Integer>> result) {
        if (root == null) {
            return 0;
        }
        int level = 1 + Math.max(findLeavesHelper(root.left, result), findLeavesHelper(root.right, result));
        if (result.size() < level) {
            result.add(new LinkedList<>());
        }
        result.get(level - 1).add(root.val);
        return level;
    }
}