/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int index = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return preorder(root, 0);
    }
    
    private String preorder(TreeNode root, int depth) {
        if (root == null) {
            return "#";
        }
        int i;
        String size = "";
        for (i = 0; i < depth + 1; i++) {
            size = size + ".";
        }
        String left = preorder(root.left, depth + 1);
        String right = preorder(root.right, depth + 1);
        return root.val + size + left + size + right;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return DFS(data, 0);
    }
    
    private TreeNode DFS(String data, int depth) {
        int numDash = 0;
        while (index + numDash < data.length() && data.charAt(index + numDash) == '.') {
            numDash++;
        }
        if (numDash != depth) {
            return null;
        }
        
        int next = index + numDash;
        while (next < data.length() && data.charAt(next) != '.') {
            next++;
        }
        String temp = data.substring(index + numDash, next);
        index = next;
        if (temp.equals("#")) {
            return null;
        }
        int val = Integer.parseInt(temp);
        TreeNode root = new TreeNode(val);
        root.left = DFS(data, depth + 1);
        root.right = DFS(data, depth + 1);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "{}";
        }
        
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        queue.add(root);
        
        for (int i = 0; i < queue.size(); i++) {
            TreeNode node = queue.get(i);
            if (node == null) {
                continue;
            }
            queue.add(node.left);
            queue.add(node.right);
        }
        
        while (queue.get(queue.size() - 1) == null) {
            queue.remove(queue.size() - 1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("{");
        sb.append(queue.get(0).val);
        for (int i = 1; i < queue.size(); i++) {
            if (queue.get(i) == null) {
                sb.append(",#");
            }
            else {
                sb.append(",");
                sb.append(queue.get(i).val);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("{}")) {
            return null;
        }

        String[] vals = data.substring(1, data.length() - 1).split(",");
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        queue.add(root);
        
        int index = 0;
        boolean isLeftChild = true;
        
        for (int i = 1; i < vals.length; i++) {
            if (!vals[i].equals("#")) {
                TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
                if (isLeftChild) {
                    queue.get(index).left = node;
                }
                else {
                    queue.get(index).right = node;
                }
                queue.add(node);
            }
            if (!isLeftChild) {
                index++;
            }
            
            isLeftChild = !isLeftChild;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));