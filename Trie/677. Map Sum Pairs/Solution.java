class MapSum {
    private Map<String, Integer> map;
    class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        int val;
        TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
            val = 0;
        }
    }
    
    private final TrieNode root;
    /** Initialize your data structure here. */
    public MapSum() {
        map = new HashMap<>();
        root = new TrieNode();
    }
    
    public void insert(String key, int val) {
        int score = val - map.getOrDefault(key, 0);
        map.put(key, val);
        TrieNode current = root;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
            current.val += score;
        }
        current.endOfWord = true;
    }
    
    public int sum(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                return 0;
            }
            current = node;
        }
        return current.val;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */