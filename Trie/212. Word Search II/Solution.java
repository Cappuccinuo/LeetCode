class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> result = new HashSet();
        TrieTree tree = new TrieTree();
        for (String word : words) {
            tree.add(word);
        }
        TrieNode root = tree.root;
        int m = board.length;
        int n = board[0].length;
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (root.children.containsKey(board[i][j])) {
                    DFS(board, root, result, i, j, m, n);
                }
            }
        }
        
        return new LinkedList<>(result);
    }
    
    private void DFS(char[][] board, TrieNode root, Set<String> result, 
                     int i, int j, int m, int n) {
        if (!inBound(i, j, m, n) || !root.children.containsKey(board[i][j])) {
            return;
        }
        char val = board[i][j];
        TrieNode child = root.children.get(val);
        if (child.isWord) {
            result.add(child.word);
        }
        board[i][j] = '#';
        for (int[] direction : DIRECTIONS) {
            DFS(board, child, result, i + direction[0], j + direction[1], m, n);
        }
        board[i][j] = val;
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}

class TrieTree {
    TrieNode root;
    
    TrieTree() {
        this.root = new TrieNode();
    }
    
    void add(String word) {
        char[] letters = word.toCharArray();
        TrieNode current = root;
        for (char letter : letters) {
            if (!current.children.containsKey(letter)) {
                TrieNode newNode = new TrieNode();
                current.children.put(letter, newNode);
            }
            current = current.children.get(letter);
        }
        current.isWord = true;
        current.word = word;
    }
}

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isWord;
    String word;
    
    TrieNode() {
        this.children = new HashMap<>();
        this.isWord = false;
        this.word = null;
    }
}