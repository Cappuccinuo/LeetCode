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
    Map<String, Integer> frequency;
    List<TreeNode> result;
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        result = new LinkedList<>();
        frequency = new HashMap<>();
        
        DFS(root);
        return result;
    }
    
    private String DFS(TreeNode root) {
        if (root == null) {
            return "#";
        }
        
        String serialize = root.val + " " + DFS(root.left) + " " + DFS(root.right);
        frequency.put(serialize, frequency.getOrDefault(serialize, 0) + 1);
        if (frequency.get(serialize) == 2) {
            result.add(root);
        }
        return serialize;
    }
}