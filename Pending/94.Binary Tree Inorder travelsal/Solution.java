public class Solution {
    public List<Integer> inordertravelsal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode tempNode = root;
        stack.push(tempNode);
        
        while (!stack.isEmpty()) {
            while ((tempNode = stack.peek()) != null) {
                tempNode = tempNode.left;
                stack.push(tempNode);
            }
            stack.pop();
            if (!stack.isEmpty()) {
                tempNode = stack.pop();
                list.add(tempNode.val);
                stack.push(tempNode.right);
            }
        }
        return list;
    }
}
