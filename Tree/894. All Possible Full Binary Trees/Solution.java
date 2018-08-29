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
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> result = new ArrayList<>();
        
        if (N == 1) {
            result.add(new TreeNode(0));
            return result;
        }
        
        N = N - 1;
        
        for (int i = 1; i < N; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(N - i);
            
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode curr = new TreeNode(0);
                    curr.left = l;
                    curr.right = r;
                    result.add(curr);
                }
            }
        }
        
        return result;
    }
}