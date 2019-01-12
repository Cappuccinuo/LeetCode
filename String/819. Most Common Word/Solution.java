class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWord = new HashSet(Arrays.asList(banned));
        
        String[] words = paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!bannedWord.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}