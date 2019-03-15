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
    public List<List<String>> printTree(TreeNode root) {
        int depth = getDepth(root);
        int width = (int)Math.pow(2, depth) - 1;
        String[][] matrix = new String[depth][width];
        for (String[] row : matrix) {
            Arrays.fill(row, "");
        }
        
        DFS(root, matrix, 0, width, 0);
        
        List<List<String>> res = new LinkedList<>();
        int i, j;
        for (i = 0; i < depth; i++) {
            List<String> list = new LinkedList<>();
            for (j = 0; j < width; j++) {
                list.add(matrix[i][j]);
            }
            res.add(list);
        }
        return res;
    }
    
    private void DFS(TreeNode root, String[][] matrix, int left, int right, int depth) {
        if (root == null) {
            return;
        }
        int mid = left + (right - left) / 2;
        matrix[depth][mid] = "" + root.val;
        DFS(root.left, matrix, left, mid - 1, depth + 1);
        DFS(root.right, matrix, mid + 1, right, depth + 1);
    }
    
    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return Math.max(left, right) + 1;
    }
}