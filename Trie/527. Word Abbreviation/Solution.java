class Solution {
    public List<String> wordsAbbreviation(List<String> dict) {
        List<String> result = new LinkedList<>();
        Map<String, String> wordAbbrMapping = new HashMap<>();
        Map<String, List<String>> abbrWordsMapping = new HashMap<>();
        
        // First Step
        getAbbrWordsMapping(abbrWordsMapping, dict);

        // Second Step
        getWordAbbrMapping(wordAbbrMapping, abbrWordsMapping);
        
        // Final Step
        for (String word : dict) {
            result.add(wordAbbrMapping.get(word));
        }
        
        return result;
    }
    
    // Given: Map 'abbrWordsMapping', and original string list 'dict'
    // Effect: This function will fill up the abbreviation-words map
    // Example: List<String> dict is ["abba", "acca", "abcdefg"]
    //          The abbr-words map will then be {{"a3a", ("abbca", "accba")}, {"a5g", ("abcdefg")}}
    private void getAbbrWordsMapping(Map<String, List<String>> abbrWordsMapping, List<String> dict) {
        for (String word : dict) {
            String abbr = getAbbr(word, 1);
            if (!abbrWordsMapping.containsKey(abbr)) {
                abbrWordsMapping.put(abbr, new LinkedList<>());
            }
            abbrWordsMapping.get(abbr).add(word);
        }
    }
    
    // Given: Empty map 'wordAbbrMapping', and Map 'abbrWordsMapping'
    // Effect: This function will fill up the String-Abbr map called wordAbbrMapping
    // Example: abbrWordsMapping is {{"a3a", ("abbca", "accba")}, {"a5g", ("abcdefg")}}
    //          The word-abbr map will then be {{"abbca", "ab2a"}, {"accba", "ac2a"}, {"abcdefg", "a5g"}}
    private void getWordAbbrMapping(Map<String, String> wordAbbrMapping, Map<String, List<String>> abbrWordsMapping) {
        for (String abbr : abbrWordsMapping.keySet()) {
            List<String> words = abbrWordsMapping.get(abbr);
            // No conflict
            if (words.size() == 1) {
                String word = words.get(0);
                wordAbbrMapping.put(word, abbr);
            }
            // Conflict, using longest prefix
            else {
                TrieTree tree = new TrieTree(new TrieNode());
                for (String word : words) {
                    tree.insert(word);
                }
                for (String word : words) {
                    int index = tree.getIndex(word);
                    String wordAbbr = getAbbr(word, index);
                    wordAbbrMapping.put(word, wordAbbr);
                }
            }
        }
    }
    
    // Given: a string, and the start index we want to compress
    // Return: the abbreviation of the given word
    // Example: word = "abbca", index = 1 => "a3a"
    //          word = "abbca", index = 2 => "ab2a"
    //          word = "abbca", index = 3 => "abbca"(If the abbreviation 
    //                                doesn't make the word shorter, then keep it as original.)
    private String getAbbr(String word, int index) {
        if (word.length() <= 2) {
            return word;
        }
        String abbr = word.substring(0, index) + 
            String.valueOf(word.length() - index - 1) + 
            word.charAt(word.length() - 1);
        if (abbr.length() >= word.length()) {
            return word;
        }
        return abbr;
    }
}

class TrieTree {
    TrieNode root;
    
    TrieTree(TrieNode node) {
        this.root = node;
    }
    
    void insert(String word) {
        TrieNode node = root;
        char[] array = word.toCharArray();
        for (char c : array) {
            if (!node.children.containsKey(c)) {
                TrieNode newNode = new TrieNode();
                node.children.put(c, newNode);
            }
            node.count++;
            node = node.children.get(c);
        }
    }
    
    //    root     (children: b), (count = 3)
    //     |
    //     b       (children: a, b), (count: 3)
    //   /   \
    //  a     b    a: (children: b, c), (count: 2)  b: (children: c), (count, 1)
    // / \    |
    // b  c   c    b: (children: c), (count: 1)  c: (children: c), (count, 1)
    // |  |   |
    // c  c   c
    int getIndex(String word) {
        TrieNode node = root;
        char[] array = word.toCharArray();
        int step = 0;
        for (char c : array) {
            if (node.count == 1) {
                break;
            }
            step++;
            node = node.children.get(c);
        }
        return step;
    }
}

class TrieNode {
    Map<Character, TrieNode> children;
    int count;
    
    TrieNode() {
        children = new HashMap<>();
        count = 0;
    }
}