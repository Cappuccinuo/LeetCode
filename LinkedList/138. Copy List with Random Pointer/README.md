Time spent : 10 min(See hint)

A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.



We don't care about the structure of the list in this problem, all we need to is assign the same next and random to new node as before, so we need a hashmap to store the original node, and its corresponding new node.

First traverse the entire list and put node and new node in the map.

Then go through the whole map, the newNode is entry.getValue(), the newNode's next is the original node's next, but must be the new node, so it is map.get(entry.getKey().next). Same as random.

