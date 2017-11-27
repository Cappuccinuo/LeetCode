class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) {
            return false;
        }
        Set<String> pairSet = new HashSet<>();
        for (int i = 0; i < pairs.length; i++) {
            pairSet.add(pairs[i][0] + "#" + pairs[i][1]);
        }
        
        for (int i = 0; i < words1.length; i++) {
            if (!words1[i].equals(words2[i])) {
                String pair1 = words1[i] + "#" + words2[i];
                String pair2 = words2[i] + "#" + words1[i];
                if (!(pairSet.contains(pair1) || pairSet.contains(pair2))) {
                    return false;
                }
            }
        }
        return true;
    }
}