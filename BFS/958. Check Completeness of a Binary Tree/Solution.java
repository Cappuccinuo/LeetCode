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
    public boolean isCompleteTree(TreeNode root) {
        List<Node> list = new ArrayList<>();
        list.add(new Node(root, 1));
        int i = 0;
        while (i < list.size()) {
            Node node = list.get(i++);
            if (node.treeNode.left != null) {
                list.add(new Node(node.treeNode.left, node.currentSize * 2));
            }
            if (node.treeNode.right != null) {
                list.add(new Node(node.treeNode.right, node.currentSize * 2 + 1));
            }
        }
        return list.get(i - 1).currentSize == list.size();
    }
}

class Node {
    TreeNode treeNode;
    int currentSize;
    
    Node(TreeNode n, int s) {
        this.treeNode = n;
        this.currentSize = s;
    }
}