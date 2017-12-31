/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private List<Integer> result;
    private int cursor = 0;
    
    public BSTIterator(TreeNode root) {
        result = inorder(root);
    }

    private List<Integer> inorder(TreeNode root) {
        List<Integer> tnList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            tnList.add(current.val);
            current = current.right;
        }
        return tnList;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return cursor != result.size();
    }

    /** @return the next smallest number */
    public int next() {
        int next = result.get(cursor);
        cursor++;
        return next;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */