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

// 2018.4.7 Genreral DFS
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null) {
            return result;
        }
        dfs(nums, 0, new LinkedList<Integer>(), result);
        return result;
    }
    
    private void dfs(int[] nums, 
                     int startIndex, 
                     List<Integer> subset, 
                     List<List<Integer>> result) {
        result.add(new LinkedList<Integer>(subset));
        
        for (int i = startIndex; i < nums.length; i++) {
            subset.add(nums[i]);
            dfs(nums, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null) {
            return result;
        }
        dfs(nums, 0, new LinkedList<Integer>(), result);
        return result;
    }
    
    private void dfs(int[] nums, 
                     int startIndex, 
                     List<Integer> subset, 
                     List<List<Integer>> result) {
        result.add(subset);
        
        for (int i = startIndex; i < nums.length; i++) {
            List<Integer> newSet = new LinkedList<>(subset);
            newSet.add(nums[i]);
            dfs(nums, i + 1, newSet, result);
        }
    }
}