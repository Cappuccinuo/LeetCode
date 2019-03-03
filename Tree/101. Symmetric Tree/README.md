Time spent : 10 min(See hint)

GIVEN: a binary tree

RETURNS: true iff it is a mirror of itself

EXAMPLES:

Input: 

```
[1,2,2,3,4,4,3]
```

Output: true

```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```

Input: `[1,2,2,null,3,null,3]` 

Output : false

```
    1
   / \
  2   2
   \   \
   3    3
```

DESIGN STRATEGY: Iteration || Recursion

Iterative

1. Use queue. poll the top two node t1 and t2. If they are both null, continue the loop. If one of them is null, return false. If val is not equal, return false;
2. Add t1.left, t2.right, t1.right, t2.left to queue. Pay attention to the order.

Recursive

1. Same idea with iterative. Use a helper function.
2. In the helper function, if t1 == null && t2 == null, return true.

Time Complexity: 

Iterative:O(n) Because we traverse the entire input tree, where n is the total number of nodes in tree.

Recursive: O(n) Same as Iterative

Space Complexity: 

Iterative: O(n) In worst case, we have to insert O(n) nodes in the queue.

Recursive: Bound by the height of the tree. When tree is linear the height is O(n).

​			