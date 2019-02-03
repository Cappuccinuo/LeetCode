class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int N = queries.length;
        int[] result = new int[N];
        int sum = 0;
        for (int num : A) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        
        for (int i = 0; i < N; i++) {
            int val = queries[i][0];
            int pos = queries[i][1];
            if (A[pos] % 2 == 0) {
                sum -= A[pos];
            }
            A[pos] += val;
            if (A[pos] % 2 == 0) {
                sum += A[pos];
            }
            result[i] = sum;
        }
        
        return result;
    }
}