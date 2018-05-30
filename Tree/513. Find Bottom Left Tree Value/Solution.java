// 2018.5.30
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int depth = getDepth(root);
        int current = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (i == 0 && current == depth) {
                    return queue.poll().val;
                }
                TreeNode front = queue.poll();
                if (front.left != null) {
                    queue.offer(front.left);
                }
                if (front.right != null) {
                    queue.offer(front.right);
                }
            }
            current++;
        }
        
        return -1;
    }
    
    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return Math.max(left, right) + 1;
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
    int result = 0;
    int height = 0;
    public int findBottomLeftValue(TreeNode root) {
        findHelper(root, 1);
        return result;
    }
    
    public void findHelper(TreeNode root, int depth) {
        if (height < depth) {
            result = root.val;
            height = depth;
        }
        if (root.left != null) {
            findHelper(root.left, depth + 1);
        }
        if (root.right != null) {
            findHelper(root.right, depth + 1);
        }
    }
}