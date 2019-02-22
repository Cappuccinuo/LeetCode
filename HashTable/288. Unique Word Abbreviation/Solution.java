class ValidWordAbbr {
    Map<String, String> mapping;
    
    public ValidWordAbbr(String[] dictionary) {
        mapping = new HashMap<>();
        for (String word : dictionary) {
            String abbr = getAbbr(word);
            if (!mapping.containsKey(abbr)) {
                mapping.put(abbr, word);
            }
            else if (!mapping.get(abbr).equals(word)) {
                mapping.put(abbr, "");
            }
        }
    }
    
    public boolean isUnique(String word) {
        String abbr = getAbbr(word);
        if (!mapping.containsKey(abbr)) {
            return true;
        }
        
        // ["a"] "a"   ["a" "a"] "a"
        if (mapping.get(abbr).equals(word)) {
            return true;
        }
        
        return false;
    }
    
    private String getAbbr(String word) {
        if (word.length() <= 2) {
            return word;
        }
        return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
    }
}


class ValidWordAbbr {
    Map<String, Set<String>> mapping;
    
    public ValidWordAbbr(String[] dictionary) {
        mapping = new HashMap<>();
        for (String word : dictionary) {
            String abbr = getAbbr(word);
            if (!mapping.containsKey(abbr)) {
                mapping.put(abbr, new HashSet());
            }
            mapping.get(abbr).add(word);
        }
    }

    public boolean isUnique(String word) {
        String abbr = getAbbr(word);
        if (!mapping.containsKey(abbr)) {
            return true;
        }
        
        if (mapping.get(abbr).contains(word)) {
            // ["a", "a"]  "a"     ["dig"  "dog"]   "dig"
            if (mapping.get(abbr).size() == 1) {
                return true;
            }
        }
        
        return false;
    }
    
    private String getAbbr(String word) {
        if (word.length() <= 2) {
            return word;
        }
        return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
    }
}