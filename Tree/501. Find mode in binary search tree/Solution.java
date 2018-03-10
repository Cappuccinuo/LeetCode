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
    TreeNode prev;
    int max;
    int freq;
    public int[] findMode(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
    
    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        if (prev == null || prev.val == root.val) {
            freq++;
        }
        else {
            freq = 1;
        }
        if (freq > max) {
            max = freq;
            list.clear();
            list.add(root.val);
        }
        else if (freq == max) {
            list.add(root.val);
        }
        prev = root;
        inorder(root.right, list);
    }
}