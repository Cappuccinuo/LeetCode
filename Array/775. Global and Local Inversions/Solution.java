class Solution {
    public boolean isIdealPermutation(int[] A) {
        int len = A.length;
        int floor = len;
        for (int i = len - 1; i >= 2; i--) {
            floor = Math.min(floor, A[i]);
            if (floor < A[i - 2]) {
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (Math.abs(A[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }
}