class Solution {
    public int compress(char[] chars) {
        int start = 0;
        int count = 0;
        for (int end = 0; end < chars.length; end++) {
            count++;
            if (end == chars.length - 1 || chars[end] != chars[end + 1]) {
                chars[start] = chars[end];
                start++;
                if (count != 1) {
                    String num = String.valueOf(count);
                    for (int i = 0; i < num.length(); i++) {
                        chars[start++] = num.charAt(i); 
                    }
                }
                count = 0;
            }
        }
        return start;
    }
}