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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            TreeNode min = findMinNode(root.right);
            root.val = min.val;
            min.val = key;
            root.right = deleteNode(root.right, key);
        }

        return root;
    }
    
    private TreeNode findMinNode(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode dummy = new TreeNode(0);
        dummy.left = root;
        TreeNode parent = dummy;
        while (root != null && root.val != key) {
            parent = root;
            if (root.val > key) {
                root = root.left;
            }
            else if (root.val < key) {
                root = root.right;
            }
        }
        
        if (root == null) {
            return dummy.left;
        }
        
        if (root.left != null && root.right != null) {
            parent = root;
            TreeNode current = root;
            root = root.right;
            while (root.left != null) {
                parent = root;
                root = root.left;
            }
            current.val = root.val;
        }
        
        TreeNode child = root.left == null ? root.right : root.left;
        
        if (parent.left == root) {
            parent.left = child;
        }
        else {
            parent.right = child;
        }
        
        return dummy.left;
    }
}