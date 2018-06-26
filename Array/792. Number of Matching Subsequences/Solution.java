class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        int result = 0;
        List<Node>[] heads = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            heads[i] = new ArrayList<>();
        }

        for (String word : words) {
            heads[word.charAt(0) - 'a'].add(new Node(word, 0));
        }

        for (char c : S.toCharArray()) {
            List<Node> old_bucket = heads[c - 'a'];
            heads[c - 'a'] = new ArrayList<>();
            for (Node node : old_bucket) {
                node.index++;
                if (node.index == node.word.length()) {
                    result++;
                }
                else {
                    heads[node.word.charAt(node.index) - 'a'].add(node);
                }
            }
            old_bucket.clear();
        }
        return result;
    }
}

class Node {
    String word;
    int index;
    public Node(String word, int index) {
        this.word = word;
        this.index = index;
    }
}
