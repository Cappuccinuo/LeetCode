Time spent : 50 min

Solution : array k -> List	

GIVEN: a non-empty array of strings, a number k

RETURNS: the k most frequent words

EXAMPLES:

Input: 

```
["i", "love", "leetcode", "i", "love", "coding"]
2
```

Output: 

```
["i", "love"]
```

Explanation:

```
"i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.
```

Input: 

```
["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"]
4
```

Output: 

```
["the", "is", "sunny", "day"]
```

Explanation:

```
"the", "is", "sunny" and "day" are the four most frequent words,
    with the number of occurrence being 4, 3, 2 and 1 respectively.
```

DESIGN STRATEGY: Use HashMap and PriorityQueue, then use a LinkedList to store the result



1. HashMap part : 

   Store the times the number occurs, use HashMap

   `HashMap<String, Integer> map = new HashMap<String, Integer>();`

   store all the number in the array: for (String word : words)

   `map.put(word, map.getOrDefault(word, 0) + 1);`

2. PriorityQueue part :

   PriorityQueue : minHeap, the head of this queue is the least element with respect to the specified ordering.

   `PriorityQueue<String> pq = new PriorityQueue<>`

   `((o1, o2) -> (map.get(o1) == map.get(o2) ? `

   `o2.compareTo(o1) : map.get(o1) - map.get(o2)));`

   map.get(o1) - map.get(o2) is in ascending order

   o2.compareTo(o1) is in ascending order, compare the ASCII, so we can know the alphabetical order.

   then add the strings in map.KeySet to PriorityQueue, if the queue's size exceed the k, remove the head of the queue, which is supposed to be the smallest one.

3. New a LinkedList, while the priority queue is not empty, add the head of queue one by one.

   As the frequency should be sorted from highest to lowest, so we need to reverse the list.