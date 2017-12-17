class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Integer, Integer> licensePlateMap = new HashMap<>();
        enterWordToMap(licensePlate, licensePlateMap);
        sortWordsLength(words);
        return getShortestCompletingWord(licensePlateMap, words);
    }
    
    // GIVEN: the letter frequency HashMap of the licensePlate, an words dictionary
    // RETURNS: the minimum length word from words, which has all the letters in the HashMap 
    public String getShortestCompletingWord(Map<Integer, Integer> licensePlateMap, String[] words) {
        String result = "";
        for (String word : words) {
            Map<Integer, Integer> wordMap = new HashMap<>();
            enterWordToMap(word, wordMap);
            boolean isComplete = true;
            for (Integer i : licensePlateMap.keySet()) {
                if (wordMap.get(i) == null || wordMap.get(i) < licensePlateMap.get(i)) {
                    isComplete = false;
                    break;
                }
            }
            if (isComplete) {
                return word;
            }
        }
        return result;
    }

    
    // EFFECT: Sort the words array based on length of each word
    public void sortWordsLength(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            public int compare (String s1, String s2) {
                if (s1.length() < s2.length()) {
                    return -1;
                }
                else if (s1.length() > s2.length()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
    }
    
    // EFFECT: key is every char of the word, value is the frequency
    //         ignore the case, change all the lowercase value to uppercase
    public void enterWordToMap(String word, Map<Integer, Integer> map) {
        for (char c : word.toCharArray()) {
            int charVal = c - '0';
            if (charVal >= 17 && charVal <= 42) {
                map.put(charVal, map.getOrDefault(charVal, 0) + 1);
            }
            if (charVal >= 49 && charVal <= 74) {
                int normCharVal = charVal - 32;
                map.put(normCharVal, map.getOrDefault(normCharVal, 0) + 1);
            }
        }
    }
}