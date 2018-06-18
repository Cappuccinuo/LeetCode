class Solution {
    public int minSwap(int[] A, int[] B) {
        int fixRecord = 0;
        int swapRecord = 1;
        int N = A.length;
        for (int i = 1; i < N; i++) {
            if (A[i - 1] >= B[i] || A[i] <= B[i - 1]) {
                swapRecord++;
            }
            else if (A[i - 1] >= A[i] || B[i - 1] >= B[i]) {
                int temp = swapRecord;
                swapRecord = fixRecord + 1;
                fixRecord = temp;
            }
            else {
                int min = Math.min(fixRecord, swapRecord);
                swapRecord = min + 1;
                fixRecord = min;
            }
        }
        return Math.min(swapRecord, fixRecord);
    }
}