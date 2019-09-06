class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> result = new LinkedList<>();
        int len = s.length();
        
        int[][] prefixSum = new int[len + 1][26];
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = 0; j < 26; j++) {
                prefixSum[i + 1][j] = prefixSum[i][j];
            }
            prefixSum[i + 1][s.charAt(i) - 'a']++;
        }
        
        for (int[] query : queries) {
            int count = 0;
            for (i = 0; i < 26; i++) {
                count += (prefixSum[query[1] + 1][i] - prefixSum[query[0]][i]) % 2;
            }
            if (count / 2 > query[2]) {
                result.add(false);
            }
            else {
                result.add(true);
            }
        }
        
        return result;
    }
}