class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            DFS(i, result, n);
        }
        return result;
    }
    
    private void DFS(int start, List<Integer> result, int n) {
        if (start > n) {
            return;
        }
        result.add(start);
        for (int i = 0; i < 10; i++) {
            DFS(start * 10 + i, result, n);
        }
    }
}