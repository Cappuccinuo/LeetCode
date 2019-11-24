/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class FindElements {
    Set<Integer> set = new HashSet();

    public FindElements(TreeNode root) {
        changeValue(root, 0);
    }
    
    private void changeValue(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        root.val = val;
        set.add(root.val);
        changeValue(root.left, val * 2 + 1);
        changeValue(root.right, val * 2 + 2);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */