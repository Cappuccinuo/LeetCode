Time spent : 30 min

GIVEN: an integer array with no duplicates

RETURNS: the maximum tree by the given array

A maximum tree building on this array is defined as follow:

1. The root is the maximum number in the array.
2. The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
3. The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.

EXAMPLES:

```
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1
```



We got to know the index of the max array, and assign l and r to record the index of left index and right index.(we don't consider the r num, so its a half open relationship)

```
    TreeNode root = new TreeNode(nums[maxIndex]);
    root.left = construct(nums, l, maxIndex);
    root.right = construct(nums, maxIndex + 1, r);
```