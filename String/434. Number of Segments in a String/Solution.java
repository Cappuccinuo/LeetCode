// 4ms
class Solution {
    public int countSegments(String s) {
        if (s.trim().length() == 0) {
            return 0;
        }
        return s.trim().split("\\s+").length;
    }
}

// 3ms
class Solution {
    public int countSegments(String s) {
        int count = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
}

// 2ms
class Solution {
    public int countSegments(String s) {
        s = s + " ";
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (!s.substring(i, i + 1).equals(" ") && s.substring(i + 1, i + 2).equals(" ")) {
                count++;
            }
        }
        return count;
    }
}