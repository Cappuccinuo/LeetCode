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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(new TreeNode(pre[0]));
        
        for (int i = 1, j = 0; i < pre.length; i++) {
            TreeNode node = new TreeNode(pre[i]);
            
            while (deque.getLast().val == post[j]) {
                deque.pollLast();
                j++;
            }
            
            if (deque.getLast().left == null) {
                deque.getLast().left = node;
            }
            else {
                deque.getLast().right = node;
            }
            
            deque.offer(node);
        }
        
        return deque.getFirst();
    }
}

class Solution {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(new TreeNode(pre[0]));
        
        for (int i = 1, j = 0; i < pre.length; i++) {
            TreeNode node = new TreeNode(pre[i]);
            
            while (stack.peek().val == post[j]) {
                stack.pop();
                j++;
            }
            
            if (stack.peek().left == null) {
                stack.peek().left = node;
            }
            else {
                stack.peek().right = node;
            }
            
            stack.push(node);
        }
        
        while (stack.size() != 1) {
            stack.pop();
        }
        
        return stack.pop();
    }
}