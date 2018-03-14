Time spent : 15min (see hint)

GIVEN: a binary search TreeNode

RETURNS: the list of leaves node after collect and remove

**Example:**
Given binary tree 

```
          1
         / \
        2   3
       / \     
      4   5    

```

Returns `[4, 5, 3], [2], [1]`.

**Explanation:**

1. Removing the leaves `[4, 5, 3]` would result in this tree:

```
          1
         / 
        2          

```

2. Now removing the leaf `[2]` would result in this tree:

```
          1          

```

3. Now removing the leaf `[1]` would result in the empty tree:

```
          []         

```

Returns `[4, 5, 3], [2], [1]`.



We need to do a bottom-up for this problem. Initial leaves, the level is 0, then 1, then...

So it is the height of tree that matters.

For each left node, we calculate their height, and put their val to corresponding height arraylist.