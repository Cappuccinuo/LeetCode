class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] letters = text.toCharArray();
        int[] count = new int[26];
        for (char letter : letters) {
            count[letter - 'a']++;
        }
        
        int min = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < 26; i++) {
            if (i == 'a' - 'a' || i == 'b' - 'a' || i == 'n' - 'a') {
                min = Math.min(min, count[i]);
            }
            if (i == 'o' - 'a' || i == 'l' - 'a') {
                min = Math.min(min, count[i] / 2);
            }
        }
        return min;
    }
}