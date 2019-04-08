class Solution {
    public boolean canTransform(String start, String end) {
        if (!start.replaceAll("X", "").equals(end.replaceAll("X", ""))) {
            return false;
        }
        
        int i = 0;
        int j = 0;
        int slen = start.length();
        int elen = end.length();
        
        while (i < slen && j < elen) {
            while (i < slen && start.charAt(i) == 'X') {
                i++;
            }
            while (j < elen && end.charAt(j) == 'X') {
                j++;
            }
            if (i < slen && start.charAt(i) == 'L') {
                if (i < j) {
                    return false;
                }
            }
            if (i < slen && start.charAt(i) == 'R') {
                if (i > j) {
                    return false;
                }
            }
            i++;
            j++;
        }
        return true;
    }
}