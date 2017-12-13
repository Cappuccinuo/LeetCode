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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorderTraverse(root, list);
        return search(list, k);
    }
    
    public boolean search(List<Integer> list, int k) {
        int lo = 0;
        int hi = list.size() - 1;
        while (lo < hi) {
            int sum = list.get(lo) + list.get(hi);
            if (sum == k) {
                return true;
            }
            if (sum < k) {
                lo++;
            }
            if (sum > k) {
                hi--;
            }
        }
        return false;
    }
    
    public void inorderTraverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.left, list);
        list.add(root.val);
        inorderTraverse(root.right, list);
    }
}