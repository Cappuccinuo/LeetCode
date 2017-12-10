class Solution {
    public void reverseWords(char[] str) {
        int len = str.length;
        reverse(str, 0, len - 1);
        int r = 0;
        int l = 0;
        while (r < len) {
            if (str[r] == ' ') {
                reverse(str, l, r - 1);
                l = r + 1;
            }
            r++;
        }
        reverse(str, l, r - 1);
    }
    
    public void reverse(char[] str, int l, int r) {
        while (l < r) {
            char temp = str[l];
            str[l++] = str[r];
            str[r--] = temp;
        } 
    }
}