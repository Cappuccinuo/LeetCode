class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int minDistance = Integer.MAX_VALUE;
        int i1 = -1;
        int i2 = -1;
        if (word1.equals(word2)) {
            int prev = Integer.MAX_VALUE;
            int curr = -1;
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals(word1)) {
                    continue;
                }
                curr = i;
                if (prev != Integer.MAX_VALUE) {
                    minDistance = Math.min(minDistance, curr - prev);
                }
                prev = curr;
            }
            return minDistance;
        }
            
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                i1 = i;
            }
            else if (words[i].equals(word2)) {
                i2 = i;
            }
            if (i1 != -1 && i2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(i2 - i1));
            }
        }
        return minDistance;
    }
}