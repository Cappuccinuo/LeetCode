// 8ms
class Solution {
    public String reverseWords(String s) {
        char[] sArr = s.toCharArray();
        int spaceIndex = 0;
        int i = 0;
        while (i < s.length()) {
            spaceIndex = s.indexOf(" ", i);
            if (spaceIndex == -1) {
                reverse(sArr, i, s.length() - 1);
                break;
            }
            reverse(sArr, i, spaceIndex - 1);
            i = spaceIndex + 1;
        }
        return new String(sArr);
    }
    
    private void reverse(char[] strArr, int start, int end) {
        while (start < end) {
            char temp = strArr[start];
            strArr[start++] = strArr[end];
            strArr[end--] = temp;
        }
    }
}

// 10ms
class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = reverse(sArr[i], 0, sArr[i].length() - 1);
            sb.append(sArr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    
    private String reverse(String s, int start, int end) {
        char[] strArr = s.toCharArray();
        while (start < end) {
            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }
        return new String(strArr);
    }
}