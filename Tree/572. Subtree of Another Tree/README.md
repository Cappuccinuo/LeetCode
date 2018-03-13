Time spent : 20min (see hint)

GIVEN: two non-empty binary trees s and t

RETURNS: whether tree t has exactly the same structure and node values with a subtree of s.

**Example 1:**
Given tree s:

```
     3
    / \
   4   5
  / \
 1   2

```

Given tree t:

```
   4 
  / \
 1   2

```

Return true, because t has the same structure and node values with a subtree of s.

**Example 2:**
Given tree s:

```
     3
    / \
   4   5
  / \
 1   2
    /
   0

```

Given tree t:

```
   4
  / \
 1   2

```

Return  false



1. We need to have a function to judge if two tree equals.
2. We need to have a method to traverse all the possible position in s with t.