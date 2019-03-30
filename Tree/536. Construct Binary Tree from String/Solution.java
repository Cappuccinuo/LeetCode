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
    public TreeNode str2tree(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        String[] findLeftAndRight = find(s);
        
        if (findLeftAndRight[0].equals("")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(findLeftAndRight[0]));
        root.left = str2tree(findLeftAndRight[1]);
        root.right = str2tree(findLeftAndRight[2]);
        return root;
    }
    
    private String[] find(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int len = array.length;
        while (i < len && array[i] != '(') {
            i++;
        }
        String[] result = new String[3];
        result[0] = s.substring(0, i);
        if (i == len) {
            return result;
        }
        int prev = i;
        int left = 1;
        while (left != 0) {
            i++;
            if (array[i] == '(') {
                left++;
            }
            else if (array[i] == ')') {
                left--;
            }
        }
        result[1] = s.substring(prev + 1, i++);
        if (i == len) {
            return result;
        }
        result[2] = s.substring(i + 1, len - 1);
        return result;
    }
}