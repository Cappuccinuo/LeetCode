class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        Map<String, Integer> map = new HashMap<>();
        int len = cells.length;
        int[] result = new int[len];

        while (N > 0) {
            map.put(Arrays.toString(cells), N);
            N--;
            result = new int[len];
            
            for (int i = 1; i < len - 1; i++) {
                if (checkNeighbour(cells, i)) {
                    result[i] = 1;
                }
                else {
                    result[i] = 0;
                }
            }
            
            cells = result;
            if (map.containsKey(Arrays.toString(cells))) {
                N %= map.get(Arrays.toString(cells)) - N;
            }
        }
        
        return cells;
    }
    
    private boolean checkNeighbour(int[] cells, int i) {
        return (cells[i - 1] ^ cells[i + 1]) == 0;
    }
    
    private void copyArray(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            A[i] = B[i];
        }
    }
}