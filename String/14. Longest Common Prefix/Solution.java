class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        String prefix = strs[0];
        int i = 1;
        while (i < len) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            i++;
        }
        return prefix;
    }
}