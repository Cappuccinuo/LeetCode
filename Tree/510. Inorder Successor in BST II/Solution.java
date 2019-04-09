/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/
class Solution {
    public Node inorderSuccessor(Node x) {
        if (x.right != null) {
            Node current = x.right;
            Node prev = x;
            while (current != null) {
                prev = current;
                current = current.left;
            }
            return prev;
        }
        Node current = x.parent;
        while (current != null && current.val < x.val) {
            current = current.parent;
        }
        return current;
    }
}


/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/
class Solution {
    public Node inorderSuccessor(Node x) {
        if (x.right != null) {
            Node current = x.right;
            Node prev = x;
            while (current != null) {
                prev = current;
                current = current.left;
            }
            return prev;
        }
        Node current = x.parent;
        if (current == null) {
            return null;
        }
        if (current.left == x) {
            return current;
        }
        Node prev = x;
        while (current != null && current.right == prev) {
            prev = current;
            current = current.parent;
        }
        return current;
    }
}