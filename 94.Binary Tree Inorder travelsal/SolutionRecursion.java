public class SolutionRecursion {
    public List<Integer> list = new ArrayList<Integer>();
    public list<Integer> inorderTravelsal(TreeNode root) {
        inOrder(root);
        return list;
    }
    
    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            inOrder(node.left);
        }
        list.add(node.val);
        if (node.right != null) {
            inOrder(node.right);
        }
    }
}
