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
    List<Integer> result;
    public List<Integer> largestValues(TreeNode root) {
        result = new ArrayList<>();
        largestValuesHelper(root, 0);
        return result;
    }
    
    public void largestValuesHelper(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth == result.size()) {
            result.add(root.val);
        }
        else {
            result.set(depth, Math.max(result.get(depth), root.val));
        }
        largestValuesHelper(root.left, depth + 1);
        largestValuesHelper(root.right, depth + 1);
    }
}