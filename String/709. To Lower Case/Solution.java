class Solution {
    public String toLowerCase(String str) {
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] >= 65 && letters[i] <= 90) {
                letters[i] = (char)(letters[i] + 32);
            }
        }
        return new String(letters);
    }
}