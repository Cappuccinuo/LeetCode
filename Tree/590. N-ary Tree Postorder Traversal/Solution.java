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
    public List<Integer> postorder(Node root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node top = stack.pop();
            for (Node n : top.children) {
                stack.push(n);
            }
            result.add(top.val);
        }
        Collections.reverse(result);
        return result;
    }
}

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new LinkedList<>();
        postorderHelper(root, result);
        return result;
    }
    
    private void postorderHelper(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        for (Node n : root.children) {
            postorderHelper(n, result);
        }
        result.add(root.val);
    }
}