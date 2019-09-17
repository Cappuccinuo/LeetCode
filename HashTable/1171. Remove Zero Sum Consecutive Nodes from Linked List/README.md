Time spent : 30 min(Self)

GIVEN: The head of a linked list

RETURNS: repeatedly delete consecutive sequences of nodes that sum to `0` until there are no such sequences and return the head of the final linked list. 

EXAMPLES:

**Example 1:**

```
Input: head = [1,2,-3,3,1]
Output: [3,1]
Note: The answer [1,2,1] would also be accepted.
```

**Example 2:**

```
Input: head = [1,2,3,-3,4]
Output: [1,2,4]
```

**Example 3:**

```
Input: head = [1,2,3,-3,-2]
Output: [1]
```

Algorithm:

Use a hashmap to record the prefix sum currently. If we find the same prefix sum now, there must be a sum of 0 segment in the linked list, so we can find the front of the segment, and cut it off from the list. Remind to delete all the sum between the segment.