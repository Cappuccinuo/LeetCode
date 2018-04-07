// 2018.4.7 DFS
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null) {
            return result;
        }
        Arrays.sort(nums);
        dfs(nums, 0, new LinkedList<>(), result);
        return result;
    }
    
    // 1. Definition of DFS
    private void dfs(int[] nums, 
                     int index, 
                     List<Integer> subset, 
                     List<List<Integer>> result) {
        // 3. Exit of DFS
        if (index == nums.length) {
            result.add(new LinkedList<Integer>(subset));
            return;
        }
        
        // 2. Recursion Division
        // Pick
        subset.add(nums[index]);
        dfs(nums, index + 1, subset, result);
        
        // Not pick
        subset.remove(subset.size() - 1);
        dfs(nums, index + 1, subset, result);
    }
}