// 2018.4.16
class Solution {
    public void reverseWords(char[] str) {
        int start = 0;
        for (int i = 0; i <= str.length; i++) {
            if (i == str.length) {
                swap(str, start, i - 1);
                break;
            }
            if (str[i] == ' ') {
                swap(str, start, i - 1);
                start = i + 1;
            }
        }
        swap(str, 0, str.length - 1);
    }
    
    private void swap(char[] str, int i, int j) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}




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