/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */

import javafx.util.Pair;
class Solution {
    public void findSecretWord(String[] wordlist, Master master) {
        int i, k;
        for (i = 0, k = 0; i < 10 && k < 6; i++) {
            Map<String, Integer> map = new HashMap<>();
            
            for (String word1 : wordlist) {
                for (String word2 : wordlist) {
                    if (match(word1, word2) == 0) {
                        map.put(word1, map.getOrDefault(word1, 0) + 1);
                    }
                }
            }
            
            Pair<String, Integer> minimax = new Pair("", 1000);
            
            for (String word : wordlist) {
                if (map.getOrDefault(word, 0) < minimax.getValue()) {
                    minimax = new Pair(word, map.getOrDefault(word, 0));
                }
            }
            
            k = master.guess(minimax.getKey());
            
            List<String> list = new LinkedList<>();
            for (String word : wordlist) {
                if (match(minimax.getKey(), word) == k) {
                    list.add(word);
                }
            }
            wordlist = list.toArray(new String[list.size()]);
        }
    }
    
    private int match(String word1, String word2) {
        int i;
        int count = 0;
        for (i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}