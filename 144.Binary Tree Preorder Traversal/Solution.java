public class Solution {
    public list<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new List<Integer>();
        Stack<TreeNode> stack = new Stack<Integer>();
        TreeNode tempNode = root;
        stack.push(tempNode);
        
        while (!isEmpty(stack)) {
            list.add(tempNode.val);
            if (tempNode.right != null) {
                stack.push(tempNode.right);
            }
            tempNode = tempNode.left;
            if (tempNode != null && !stack.isEmpty()) {
                tempNode = stack.pop();
            }
        }
        return list;
    }
}
