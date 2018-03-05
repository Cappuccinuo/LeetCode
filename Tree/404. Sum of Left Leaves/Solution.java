/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// DFS
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                ans += root.left.val;
            }
            else {
                ans += sumOfLeftLeaves(root.left);
            }
        }
        ans += sumOfLeftLeaves(root.right);
        return ans;
    }
}

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int ans = 0;
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (temp.left != null) {
                if (temp.left.left == null && temp.left.right == null) {
                    ans += temp.left.val;
                }
                else {
                    stack.push(temp.left);
                }
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
        return ans;
    }
}

// BFS
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left != null) {
                if (temp.left.left == null && temp.left.right == null) {
                    ans += temp.left.val;
                }
                else {
                    queue.offer(temp.left);
                }
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
        return ans;
    }
}