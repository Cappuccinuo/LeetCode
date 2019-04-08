class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) {
            return true;
        }
        int i = 0;
        int j = 0;
        int len1 = name.length();
        int len2 = typed.length();
        int time1 = 0;
        int time2 = 0;
        
        while (i < len1 && j < len2) {
            if (name.charAt(i) != typed.charAt(j)) {
                return false;
            }
            time1 = 0;
            time2 = 0;
            while (i < len1 - 1 && name.charAt(i) == name.charAt(i + 1)) {
                i++;
                time1++;
            }
            while (j < len2 - 1 && typed.charAt(j) == typed.charAt(j + 1)) {
                j++;
                time2++;
            }
            if (time1 > time2) {
                return false;
            }
            i++;
            j++;
        }
        return i == len1 && j == len2;
    }
}