class Solution {
    public int maxTurbulenceSize(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int start = 0;
        int end = 1;
        int len = A.length;
        int result = 1;
        
        while (end < len) {
            int num = A[end];
            int flag = Integer.compare(A[end - 1], A[end]);
            if (flag == 0) {
                start = end;
            }
            else if (end == len - 1 ||
                (flag != -Integer.compare(A[end], A[end + 1]))) {
                result = Math.max(result, end - start + 1);
                start = end;
            }
            
            end++;
        }
        return result;
    }
}