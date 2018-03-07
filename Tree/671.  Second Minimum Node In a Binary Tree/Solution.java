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
    int smallest;
    long smaller;
    
    public int findSecondMinimumValue(TreeNode root) {
        smallest = root.val;
        smaller = Long.MAX_VALUE;
        dfs(root);
        return (int)smaller;
    }
    
    public void dfs(TreeNode root) {
        if (root != null) {
            if (root.val > smallest && root.val < smaller) {
                smaller = root.val;
            }
            else if (root.val == smallest) {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
}

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int smallest = root.val;
        int smaller = Integer.MAX_VALUE;
        boolean isFind = false;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.val > smallest) {
                    isFind = true;
                    smaller = Math.min(smaller, temp.val);
                }
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
        if (isFind) {
            return smaller;
        }
        return -1;
    }
}