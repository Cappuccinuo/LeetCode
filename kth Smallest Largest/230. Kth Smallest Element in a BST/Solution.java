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
    public int kthSmallest(TreeNode root, int k) {
        Map<TreeNode, Integer> numberOfChild = new HashMap<>();
        countChild(root, numberOfChild);
        return quickSelectOnTree(root, k, numberOfChild);
    }
    
    private int countChild(TreeNode root, Map<TreeNode, Integer> numberOfChild) {
        if (root == null) {
            return 0;
        }
        int leftCount = countChild(root.left, numberOfChild);
        int rightCount = countChild(root.right, numberOfChild);
        numberOfChild.put(root, leftCount + rightCount + 1);
        return leftCount + rightCount + 1;
    }
    
    private int quickSelectOnTree(TreeNode root, int k, Map<TreeNode, Integer> numberOfChild) {
        if (root == null) {
            return -1;
        }
        
        int left = root.left == null ? 0 : numberOfChild.get(root.left);
        if (left >= k) {
            return quickSelectOnTree(root.left, k, numberOfChild);
        }
        if (left + 1 == k) {
            return root.val;
        }
        return quickSelectOnTree(root.right, k - left - 1, numberOfChild);
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
    public int kthSmallest(TreeNode root, int k) {
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            current = stack.pop();
            count++;
            if (count == k) {
                return current.val;
            }
            
            current = current.right;
        }
        
        return -1;
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
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }
    
    private void inorder(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        inorder(root.left, k);
        count++;
        if (count == k) {
            ans = root.val;
            return;
        }
        inorder(root.right, k);
    }
}