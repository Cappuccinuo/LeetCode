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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode first = queue.poll();
                level.add(first.val);
                if (first.left != null) {
                    queue.offer(first.left);
                }
                if (first.right != null) {
                    queue.offer(first.right);
                }
            }
            result.add(level);
        }
        for (int i = 1; i < result.size(); i = i + 2) {
            Collections.reverse(result.get(i));
        }
        return result;
    }
}