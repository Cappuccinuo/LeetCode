class Solution {
    class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        String word;
        TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }
    
    private final TrieNode root = new TrieNode();
    
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
        current.word = word;
    }
    
    public String replaceWords(List<String> dict, String sentence) {
        for (String word : dict) {
            insert(word);
        }
        
        StringBuilder result = new StringBuilder();
        for (String word : sentence.split("\\s+")) {
            if (result.length() > 0) {
                result.append(" ");
            }
            TrieNode current = root;
            for (Character c : word.toCharArray()) {
                if (current.children.get(c) == null || current.endOfWord) {
                    break;
                }
                current = current.children.get(c);
            }
            result.append(current.word != null ? current.word : word);
        }
        return result.toString();
    }
}