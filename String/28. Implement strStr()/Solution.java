class Solution {
    public int strStr(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        int targetLen = target.length();
        int sourceLen = source.length();
        for (int i = 0; i <= sourceLen - targetLen; i++) {
            if (source.substring(i, i + targetLen).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}