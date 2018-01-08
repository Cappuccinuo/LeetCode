class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        while (i < s.length()) {
            int j = Math.min(i + k - 1, s.length() - 1);
            reverse(arr, i, j);
            i = i + 2 * k;
        }
        return new String(arr);
    }
    
    public void reverse(char[] arr, int lo, int hi) {
        while (lo < hi) {
            char temp = arr[lo];
            arr[lo++] = arr[hi];
            arr[hi--] = temp;
        }
    }
}