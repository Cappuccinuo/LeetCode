Time spent : 5 min(self)

GIVEN: a TreeNode

RETURNS: the values of the nodes you can see ordered from top to bottom

**Example:**

```
Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
```



Using the idea of level order traversal, when traverse to the last one of each level, add that val to result list.