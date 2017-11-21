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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            long sum = 0;
            int count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode t = queue.remove();
                count++;
                sum += t.val;
                if (t.left != null) {
                    temp.add(t.left);
                }
                if (t.right != null) {
                    temp.add(t.right);
                }
            }
            res.add((double)sum / count);
            queue = temp;
        }
        return res;
    }
}