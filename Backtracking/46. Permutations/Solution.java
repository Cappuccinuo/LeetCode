// 2018.4.10

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int n = nums.length;
        boolean[] visited = new boolean[n];
        DFS(result, visited, new LinkedList<Integer>(), nums);
        return result;
    }
    
    private void DFS(List<List<Integer>> result, 
                     boolean[] visited,
                     List<Integer> permutation, 
                     int[] nums) {
        if (permutation.size() == nums.length) {
            result.add(new LinkedList<>(permutation));
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            permutation.add(nums[i]);
            visited[i] = true;
            DFS(result, visited, permutation, nums);
            permutation.remove(permutation.size() - 1);
            visited[i] = false;
        }
    }
}