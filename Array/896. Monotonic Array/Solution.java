class Solution {
    public boolean isMonotonic(int[] A) {
        int flag = 0;
        for (int i = 1; i < A.length; i++) {
            int temp = Integer.compare(A[i], A[i - 1]);
            if (temp != 0) {
                if (temp != flag && flag != 0) {
                    return false;
                }
                flag = temp;
            }
        }
        return true;
    }
}