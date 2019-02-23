class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        DFS(result, new LinkedList<>(), n, k, 1);
        return result;
    }
    
    private void DFS(List<List<Integer>> result, List<Integer> combination, int n, int k, int start) {
        if (combination.size() == k) {
            result.add(new LinkedList<>(combination));
            return;
        }
        
        int i;
        for (i = start; i <= n; i++) {
            combination.add(i);
            DFS(result, combination, n, k, i + 1);
            combination.remove(combination.size() - 1);
        }
    }
}