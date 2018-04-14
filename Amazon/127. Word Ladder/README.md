Time spent : 15min(see little hint)

Solution : BFS

GIVEN:  two words (*beginWord* and *endWord*), and a dictionary's word list

RETURNS: the length of shortest transformation sequence from *beginWord* to *endWord*

EXAMPLES:

Given:
*beginWord* = `"hit"`
*endWord* = `"cog"`
*wordList* = `["hot","dot","dog","lot","log","cog"]`

As one shortest transformation is `"hit" -> "hot" -> "dot" -> "dog" -> "cog"`,

DESIGN STRATEGY: BFS



```
Queue<T> queue = new LinkedList<>();
Set<T> set = new HashSet<>();

set.add(start);
queue.offer(start);
while (!queue.isEmpty()) {
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        T head = queue.poll();
        for (T neighbor : head.neighbors) {
            if (!set.contains(neighbor)) {
                set.add(neighbor);
                queue.offer(neighbor);
            }
        }
    }
}
```

First store all the words in a set called dict. We need a function to find nextWord. Traverse all the 26 characters. And replace the character in each char in the word, compare with the dict.