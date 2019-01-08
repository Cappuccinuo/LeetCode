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
    int[] voyage;
    int index;
    
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        result = new ArrayList<>();
        this.voyage = voyage;
        index = 0;
        
        dfs(root);
        
        if (!result.isEmpty() && result.get(0) == -1) {
            return result;
        }
        
        return result;
    }
    
    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        
        if (root.val != voyage[index++]) {
            result.clear();
            result.add(-1);
            return;
        }
        
        if (index < voyage.length && root.left != null && root.left.val != voyage[index]) {
            result.add(root.val);
            dfs(root.right);
            dfs(root.left);
        }
        else {
            dfs(root.left);
            dfs(root.right);
        }
    }
}