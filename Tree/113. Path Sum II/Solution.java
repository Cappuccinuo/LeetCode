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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        List<Integer> subset = new LinkedList<>();
        pathSumHelper(result, subset, root, sum);
        return result;
    }
    
    private void pathSumHelper(List<List<Integer>> result, List<Integer> subset, TreeNode root, int target) {
        if (root == null) {
            return;
        }
        
        target -= root.val;
        
        if (root.left == null && root.right == null) {
            if (target == 0) {
                subset.add(root.val);
                result.add(new LinkedList<>(subset));
                subset.remove(subset.size() - 1);
                return;
            }
        }
        
        subset.add(root.val);
        pathSumHelper(result, subset, root.left, target);
        pathSumHelper(result, subset, root.right, target);
        subset.remove(subset.size() - 1);
    }
}