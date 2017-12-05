class Solution {
    public int monotoneIncreasingDigits(int N) {
        String numStr = String.valueOf(N);
        int len = numStr.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = numStr.charAt(i) - '0';
        }
        int level = len - 1;
        for (int i = numStr.length() - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                arr[i - 1]--;
                level = i - 1;
            }
        } 
        
        StringBuilder sb = new StringBuilder();
        if (arr[0] != 0) {
            for (int i = 0; i <= level; i++) {
                sb.append(arr[i]);
            }
            for (int i = level + 1; i < len; i++) {
                sb.append(9);
            }
        }
        else {
            for (int i = level + 1; i < len; i++) {
                sb.append(9);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}