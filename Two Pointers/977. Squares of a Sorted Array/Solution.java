class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] result = new int[len];
        int start = 0;
        int end = len - 1;
        int index = len - 1;
        while (start <= end) {
            if (A[start] * A[start] > A[end] * A[end]) {
                result[index] = A[start] * A[start];
                start++;
            }
            else {
                result[index] = A[end] * A[end];
                end--;
            }
            index--;
        }
        return result;
    }
}

class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] result = new int[len];
        int index = 0;
        for (int a : A) {
            result[index++] = a * a;
        }
        Arrays.sort(result);
        return result;
    }
}