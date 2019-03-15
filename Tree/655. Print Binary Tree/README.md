Time spent :  15 min(Self)

GIVEN: a binary tree

RETURNS: m * n list

EXAMPLES:

**Example 1:**

```
Input:
     1
    /
   2
Output:
[["", "1", ""],
 ["2", "", ""]]
```



**Example 2:**

```
Input:
     1
    / \
   2   3
    \
     4
Output:
[["", "", "", "1", "", "", ""],
 ["", "2", "", "", "", "3", ""],
 ["", "", "4", "", "", "", ""]]
```



**Example 3:**

```
Input:
      1
     / \
    2   5
   / 
  3 
 / 
4 
Output:

[["",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""]
 ["",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""]
 ["",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]
 ["4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]]
```

Algorithm:

Use DFS to get the depth of the tree first. 

Then using DFS to fill the 2D array of the tree.