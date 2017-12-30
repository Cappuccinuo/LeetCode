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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t2.val = t1.val + t2.val;
        t2.left = mergeTrees(t1.left, t2.left);
        t2.right = mergeTrees(t1.right, t2.right);
        return t2;
    }
}

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{t1, t2});
        while (!stack.isEmpty()) {
            TreeNode[] t = stack.pop();
            if (t[0] == null || t[1] == null) {
                continue;
            }
            
            t[1].val += t[0].val;
            
            if (t[1].left == null) {
                t[1].left = t[0].left;
            }
            else {
                stack.push(new TreeNode[]{t[0].left, t[1].left});
            }
            if (t[1].right == null) {
                t[1].right = t[0].right;
            }
            else {
                stack.push(new TreeNode[]{t[0].right, t[1].right});
            }
        }
        return t2;
    }
}
