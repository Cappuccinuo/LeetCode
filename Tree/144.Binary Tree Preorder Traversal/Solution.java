public class Solution {
    public list<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
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
