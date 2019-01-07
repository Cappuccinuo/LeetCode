class Solution {
    Set<String> perfectMatch;
    Map<String, String> capital;
    Map<String, String> vowel;
    
    public String[] spellchecker(String[] wordlist, String[] queries) {
        int N = queries.length;
        String[] result = new String[N];
        
        perfectMatch = new HashSet();
        capital = new HashMap<>();
        vowel = new HashMap<>();
        
        for (String word : wordlist) {
            perfectMatch.add(word);
            
            capital.putIfAbsent(word.toLowerCase(), word);
            
            vowel.putIfAbsent(devowel(word.toLowerCase()), word);
        }
        
        int index = 0;
        for (String query : queries) {
            result[index++] = getWord(query);
        }
        return result;
    }
    
    private String getWord(String query) {
        if (perfectMatch.contains(query)) {
            return query;
        }
        
        String lq = query.toLowerCase();
        
        if (capital.containsKey(lq)) {
            return capital.get(lq);
        }
        
        if (vowel.containsKey(devowel(lq))) {
            return vowel.get(devowel(lq));
        }
        
        return "";
    }
    
    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(isVowel(c) ? '*' : c);
        }
        return sb.toString();
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}