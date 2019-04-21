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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<TreeNode, Integer> mapping = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        mapping.put(root, 0);
        
        while (!queue.isEmpty()) {
            TreeNode front = queue.poll();
            int val = mapping.get(front);
            if (!map.containsKey(val)) {
                map.put(val, new LinkedList<>());
            }
            map.get(val).add(front.val);
            if (front.left != null) {
                queue.offer(front.left);
                mapping.put(front.left, val - 1);
            }
            if (front.right != null) {
                queue.offer(front.right);
                mapping.put(front.right, val + 1);
            }
        }
        
        int i;
        for (i = Collections.min(map.keySet()); i <= Collections.max(map.keySet()); i++) {
            result.add(map.get(i));
        }
        
        return result;
    }
}