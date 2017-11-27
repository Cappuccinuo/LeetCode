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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }
    
    public TreeNode construct(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int maxIndex = maxIndex(nums, l, r);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = construct(nums, l, maxIndex);
        root.right = construct(nums, maxIndex + 1, r);
        return root;
    }
    
    public int maxIndex(int[] nums, int l, int r) {
        int maxNum = nums[l];
        int maxIndex = l;
        for (int i = l; i < r; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}