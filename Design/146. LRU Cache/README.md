Time spent :  40 min(See hint)

Design and implement a data structure for Least Recently Used (LRU) chche.

EXAMPLES:

```
LRUCache cache = new LRUCache( 2 /* capacity */ );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4
```

Algorithm:

Using singly linked list.

We will use a hashmap to store the prev node of given key.

For get method, if the map doesn't have the key, return -1. Otherwise, we get the prev node of that key node, then make tail point to the key node(move the node to tail).

For set method, we will check three condition, when get key is -1, when currentSize is less than capacity and else.