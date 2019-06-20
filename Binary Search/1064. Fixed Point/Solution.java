class Solution {
    public int fixedPoint(int[] A) {
        int len = A.length;
        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] >= mid) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        if (A[start] == start) {
            return start;
        }
        if (A[end] == end) {
            return end;
        }
        return -1;
    }
}