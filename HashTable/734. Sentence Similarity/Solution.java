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

class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) {
            return false;
        }
        Map<String, Set<String>> map = new HashMap<>();
        for (String[] pair : pairs) {
            if (!map.containsKey(pair[0])) {
                map.put(pair[0], new HashSet<String>());
            }
            if (!map.containsKey(pair[1])) {
                map.put(pair[1], new HashSet<String>());
            }
            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }
        int index = 0;
        int N = words1.length;
        while(index < N) {
            String s1 = words1[index];
            String s2 = words2[index];
            if (s1.equals(s2)) {
                index++;
                continue;
            }
            if (!map.containsKey(s1) || !map.containsKey(s2) || !map.get(s1).contains(s2) || !map.get(s2).contains(s1)) {
                return false;
            }
            index++;
        }
        return true;
    }
}