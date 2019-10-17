class Solution {
    public int balancedStringSplit(String s) {
        char[] letters = s.toCharArray();
        int l = 0;
        int r = 0;
        int count = 0;
        for (char letter : letters) {
            if (letter == 'L') {
                l++;
            }
            else {
                r++;
            }
            if (l == r) {
                l = 0;
                r = 0;
                count += 1;
            }
        }
        return count;
    }
}