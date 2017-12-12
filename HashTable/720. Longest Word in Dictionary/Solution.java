class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words, new myComparator());
        Set<String> wordSet = new HashSet<>();
        putWordToSet(words, wordSet);

        int len = words.length;
        for (int i = len - 1; i > 0; i--) {
            if (isContainAllTheChar(words, wordSet, words[i])) {
                return words[i];
            }
        }
        return null;
    }

    // GIVEN: a word array, a set contains all the word, current string
    // RETURNS: true iff the current string can be built one character 
    // at a time by other words in the given word array
    public boolean isContainAllTheChar(String[] words, Set<String> wordSet, String current) {
        int len = current.length();
        for (int i = 1; i < len; i++) {
            String currentPart = current.substring(0, i);
            if (!wordSet.contains(currentPart)) {
                return false;
            }
        }
        return true;
    }

    // EFFECT: put all the word in words to a set
    public void putWordToSet(String[] words, Set<String> wordSet) {
        for (String word : words) {
            wordSet.add(word);
        }
    }
}

// EFFECT: sort the string in length ascending order, if two strings
//         have same length, sort the two strings in lexicographical 
//         descending order
class myComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        if (s1.length() == s2.length()) {
            return s2.compareTo(s1);
        }
        return s1.length() - s2.length();
    }
}