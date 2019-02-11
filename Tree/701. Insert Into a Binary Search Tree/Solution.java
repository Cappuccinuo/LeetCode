// Recursive
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }
        else {
            root.right = insertIntoBST(root.right, val);
        }
        
        return root;
    }
}
// Iterative
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode parent = root;
        TreeNode current = root;
        while (current != null) {
            parent = current;
            if (current.val > val) {
                current = current.left;
                if (current == null) {
                    parent.left = new TreeNode(val);
                }
            }
            else {
                current = current.right;
                if (current == null) {
                    parent.right = new TreeNode(val);
                }
            }
        }

        return root;
    }
}