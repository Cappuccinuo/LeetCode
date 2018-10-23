class WordDictionary {
    TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = root;
        char[] ch = word.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (node.children.containsKey(ch[i])) {
                node = node.children.get(ch[i]);
            }
            else {
                TrieNode newNode = new TrieNode(ch[i]);
                node.children.put(ch[i], newNode);
                node = newNode;
            }
        }
        node.hasWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        TrieNode node = root;
        char[] ch = word.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '.') {
                for (char c : node.children.keySet()) {
                    if (search(word.substring(0, i) + c + word.substring(i + 1))) {
                        return true;
                    }
                }
                return false;
            }
            else {
                if (!node.children.containsKey(ch[i])) {
                    return false;
                }
                node = node.children.get(ch[i]);
            }
        }
        return node.hasWord;
    }
}

class TrieNode {
    char c;
    Map<Character, TrieNode> children;
    boolean hasWord;
    TrieNode() {
        children = new HashMap<>();
    }
    
    TrieNode(char c) {
        this.c = c;
        children = new HashMap<>();
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */


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