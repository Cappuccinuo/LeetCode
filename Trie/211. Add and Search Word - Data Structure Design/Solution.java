class WordDictionary {

    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }
    
    private TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchRecursion(root, word, 0);
    }
    
    public boolean searchRecursion(TrieNode current, String word, int index) {
        if (index == word.length()) {
            return current.endOfWord;
        }
        char ch = word.charAt(index);
        if (ch == '.') {
            boolean isExist = false;
            index = index + 1;
            for (TrieNode node : current.children.values()) {
                isExist = isExist || searchRecursion(node, word, index);
            }
            return isExist;
        }
        TrieNode node = current.children.get(ch);
        if (node == null) {
            return false;
        }
        current = node;
        return searchRecursion(current, word, index + 1);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */