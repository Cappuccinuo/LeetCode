Time spent :  10 min(Self)

GIVEN: a string consisting of parenthesis and integers.

RETURNS: root

EXAMPLES:

```
Input: "4(2(3)(1))(6(5))"
Output: return the tree root node representing the following tree:

       4
     /   \
    2     6
   / \   / 
  3   1 5   
```

Algorithm:

Using recursion. First find the root value, and first () parentheses is its left, second () parentheses is its right.