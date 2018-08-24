/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            Stack<Node> temp = new Stack<>();
            Node top = stack.pop();
            result.add(top.val);
            for (Node n : top.children) {
                temp.push(n);
            }
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
        
        return result;
    }
}

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<>();
        preorderHelper(root, result);
        return result;
    }
    
    private void preorderHelper(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        for (Node n : root.children) {
            preorderHelper(n, result);
        }
    }
}