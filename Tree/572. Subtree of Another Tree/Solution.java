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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (subTreeHelper(s, t)) {
            return true;
        }
        if (s == null) {
            return false;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean subTreeHelper(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
        return subTreeHelper(s.left, t.left) && subTreeHelper(s.right, t.right);
    }
}

class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return traverse(s, t);
    }
    
    public boolean traverse(TreeNode s, TreeNode t) {
        return s != null && (equals(s, t) || traverse(s.left, t) || traverse(s.right, t)); 
    }
    
    public boolean equals(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } 
        if (s == null || t == null) {
            return false;
        }
        if (s.val == t.val && equals(s.left, t.left) && equals(s.right, t.right)) {
            return true;
        }
        return false;
    }
}