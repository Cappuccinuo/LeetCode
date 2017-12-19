/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public int rob(TreeNode root) {
        return robFrom(root, new HashMap<>());
    }
    
    public int robFrom(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) {
            return 0;
        }
        if (map.containsKey(root)) {
            return map.get(root);
        }
        int val = 0;
        if (root.left != null) {
            val += robFrom(root.left.left, map) + robFrom(root.left.right, map);
        }
        if (root.right != null) {
            val += robFrom(root.right.left, map) + robFrom(root.right.right, map);
        }
        val = Math.max(val + root.val, robFrom(root.left, map) + robFrom(root.right, map));
        map.put(root, val);
        return val;
    }
}

class Solution2 {
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(robInclude(root), robExclude(root));
    }
    
    public int robInclude(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return robExclude(root.left) + robExclude(root.right) + root.val;
    }
    
    public int robExclude(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return rob(root.left) + rob(root.right);
    }
}