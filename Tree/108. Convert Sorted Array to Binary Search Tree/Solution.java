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
    public TreeNode sortedArrayToBST(int[] nums) {
        return treeBuild(nums, 0, nums.length - 1);
    }
    
    public TreeNode treeBuild(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = (left + right) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = treeBuild(nums, left, middle - 1);
        node.right = treeBuild(nums, middle + 1, right);
        return node;
    }
}