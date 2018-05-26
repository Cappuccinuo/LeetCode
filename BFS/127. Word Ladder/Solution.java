// BFS 2018.5.26
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.equals(endWord)) {
            return 1;
        }
        
        if (wordList == null || wordList.size() == 0) {
            return 0;
        }
        Set<String> dict = new HashSet(wordList);
        if (!dict.contains(endWord)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet();
        
        queue.offer(beginWord);
        visited.add(beginWord);
        
        int path = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (word.equals(endWord)) {
                    return path;
                }
                for (String neighbor : getNextWords(word, dict)) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
            path++;
        }
        
        return 0;
    }
    
    private List<String> getNextWords(String word, Set<String> dict) {
        List<String> nextWords = new LinkedList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    continue;
                }
                String replaced = replaceBy(word, ch, i);
                if (dict.contains(replaced)) {
                    nextWords.add(replaced);
                }
            }
        }
        return nextWords;
    }
    
    private String replaceBy(String word, char ch, int index) {
        char[] letters = word.toCharArray();
        letters[index] = ch;
        return new String(letters);
    }
}


// BFS 2018.4.6

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.equals(endWord)) {
            return 1;
        }
        if (wordList == null || wordList.size() == 0) {
            return 0;
        }
        Set<String> dict = new HashSet();
        for (String word : wordList) {
            dict.add(word);
        }
        Set<String> set = new HashSet();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        set.add(beginWord);
        int length = 1;
        while (!queue.isEmpty()) {
            length++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                ArrayList<String> neighbors = getNextWords(current, dict);
                for (String neighbor : neighbors) {
                    if (set.contains(neighbor)) {
                        continue;
                    }
                    if (neighbor.equals(endWord)) {
                        return length;
                    }
                    set.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return 0;
    }
    
    public String replace(String word, int position, char c) {
        char[] letters = word.toCharArray();
        letters[position] = c;
        return new String(letters);
    }
    
    public ArrayList<String> getNextWords(String word, Set<String> dict) {
        ArrayList<String> result = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    continue;
                }
                String nextWord = replace(word, i, c);
                if (dict.contains(nextWord)) {
                    result.add(nextWord);
                }
            }
        }
        return result;
    } 
}