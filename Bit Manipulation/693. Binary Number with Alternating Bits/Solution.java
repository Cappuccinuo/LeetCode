class Solution {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        boolean isAlternate = true;
        for (int i = 0; i < str.length() - 1; i++) {
            isAlternate = isAlternate && (str.charAt(i) != str.charAt(i + 1));
        }
        return isAlternate;
    }
}