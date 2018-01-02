class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int minDistance = words.length;
        int index1 = -1;
        int index2 = -1;
        int currentDistance = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
            }
            else if (words[i].equals(word2)) {
                index2 = i;
            }
            if (index1 != -1 && index2 != -1) {
                currentDistance = Math.abs(index2 - index1);
                minDistance = Math.min(minDistance, currentDistance);
            }
        }
        return minDistance;
    }
}