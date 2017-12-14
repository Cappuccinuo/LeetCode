class Trie {

    /** Initialize your data structure here. */
    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }
    
    private final TrieNode root;
    
    public Trie() {
       root = new TrieNode(); 
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        insertRecursive(root, word, 0);
    }
    
    public void insertRecursive(TrieNode current, String word, int index) {
        if (index == word.length()) {
            current.endOfWord = true;
            return;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) {
            node = new TrieNode();
            current.children.put(ch, node);
        }
        current = node;
        insertRecursive(current, word, index + 1);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return searchRecursive(root, word, 0);
    }
    
    public boolean searchRecursive(TrieNode current, String word, int index) {
        if (index == word.length()) {
            return current.endOfWord;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) {
            return false;
        }
        current = node;
        return searchRecursive(current, word, index + 1);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return startsWithRecursive(root, prefix, 0);
    }
    
    public boolean startsWithRecursive(TrieNode current, String prefix, int index) {
        if (index == prefix.length()) {
            return true;
        }
        char ch = prefix.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) {
            return false;
        }
        current = node;
        return startsWithRecursive(current, prefix, index + 1);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */