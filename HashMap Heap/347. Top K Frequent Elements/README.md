Time spent : 50 min

Solution : array k -> List	

GIVEN: a non-empty array of integers, a number k

RETURNS: the k most frequent elements

EXAMPLES:

Input: 

```
[1,1,1,2,2,3]
2
```

Output: 

`[1, 2]`

DESIGN STRATEGY: Use HashMap and PriorityQueue, then use a LinkedList to store the result



1. HashMap part : 

   Store the times the number occurs, use HashMap

   `HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();`

   store all the number in the array: for (int num : nums)

   `map.put(num, map.getOrDefault(num, 0) + 1);`

2. PriorityQueue part :

   PriorityQueue : minHeap, the head of this queue is the least element with respect to the specified ordering.

   `PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> map.get(o1) - map.get(o2));`

   map.get(o1) - map.get(o2) is in ascending order

   then add the integers in map.KeySet to PriorityQueue, if the queue's size exceed the k, remove the head of the queue, which is supposed to be the smallest one.

3. New a LinkedList, while the priority queue is not empty, add the head of queue one by one.

   As the frequency should be sorted from highest to lowest, so we need to reverse the list.
