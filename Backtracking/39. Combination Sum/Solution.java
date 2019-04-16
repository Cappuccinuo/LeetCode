class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> nums = new LinkedList<>();
        backtracking(result, nums, candidates, 0, target);
        return result;
    }
    
    private void backtracking(List<List<Integer>> result, List<Integer> nums,
                             int[] candidates, int index, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new LinkedList<>(nums));
        }

        int i;
        for (i = index; i < candidates.length; i++) {
            nums.add(candidates[i]);
            backtracking(result, nums, candidates, i, target - candidates[i]);
            nums.remove(nums.size() - 1);
        }
    }
}