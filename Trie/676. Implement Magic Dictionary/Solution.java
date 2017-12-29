class MagicDictionary {
    class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }
    
    private final TrieNode root;
    /** Initialize your data structure here. */
    public MagicDictionary() {
        root = new TrieNode();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for (String str : dict) {
            insert(str);
        }
    }
    
    private void insert(String word) {
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
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        TrieNode current = root;
        int k = 0;
        while (current != null) {
            if (k == word.length()) {
                return false;
            }
            char ch = word.charAt(k);
            int ascii = ch - 'a';
            for (int i = 0; i < 26; i++) {
                if (i == ascii) {
                    continue;
                }
                if (current.children.get((char)(i + 97)) != null && searchUtil(current.children.get((char)(i + 97)), word, k + 1)) {
                    return true;
                }
            }
            k++;
            current = current.children.get(ch);
        }
        return false;
    }
    
    public boolean searchUtil(TrieNode current, String word, int index) {
        if (index == word.length()) {
            return current.endOfWord;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) {
            return false;
        }
        return searchUtil(node, word, index + 1);
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */