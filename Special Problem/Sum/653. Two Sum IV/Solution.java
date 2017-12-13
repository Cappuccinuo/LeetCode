/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution1 {
    private Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return find(root, k);
    }
    
    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        int needSum = k - root.val;
        if (set.contains(needSum)) {
            return true;
        }
        set.add(root.val);
        return find(root.left, k) || find(root.right, k);
    }
}

class Solution2 {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            if (queue.peek() != null) {
                TreeNode node = queue.remove();
                if(set.contains(k - node.val)) {
                    return true;
                }
                set.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            else {
                queue.remove();
            }
        }
        return false;
    }
}

class Solution3 {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new LinkedList<>();
        inorder(root, list);
        int l = 0;
        int r = list.size() - 1;
        while(l < r) {
            int sum = list.get(l) + list.get(r);
            if (sum == k) {
                return true;
            }
            if (sum < k) {
                l++;
            }
            if (sum > k) {
                r--;
            }
        }
        return false;
    }
    
    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}