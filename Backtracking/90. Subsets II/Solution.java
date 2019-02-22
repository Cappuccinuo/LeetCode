class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        DFS(nums, result, 0, new LinkedList<>(), visited);
        return result;
    }
    
    private void DFS(int[] nums, List<List<Integer>> result, int index, List<Integer> subset, boolean[] visited) {
        result.add(new LinkedList<>(subset));
        
        if (index == nums.length) {
            return;
        }
        
        int i;
        for (i = index; i < nums.length; i++) {
            if (i > index && nums[i - 1] == nums[i] && !visited[i - 1]) {
                continue;
            }
            subset.add(nums[i]);
            visited[i] = true;
            DFS(nums, result, i + 1, subset, visited);
            subset.remove(subset.size() - 1);
            visited[i] = false;
        }
    }
}