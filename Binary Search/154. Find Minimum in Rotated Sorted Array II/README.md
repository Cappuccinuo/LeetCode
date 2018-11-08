Time spent :  20 min(See hint)

GIVEN: an array sorted in ascending order is rotated, allows duplicate

RETURNS: the minimum element

EXAMPLES:

**Example 1:**

```
Input: [1,3,5]
Output: 1
```

**Example 2:**

```
Input: [2,2,2,0,1]
Output: 0
```

**Example 3:(Worst case)**

```
Input: [1,1,1,1,1,1,1,1,0,1,1,1]
Output: 0
```



Algorithm:

The worst case is example 3. A 0 is hiding in many 1s. In this case we just need a for loop. O(n)

Using Binary Search, we can use nums[end] as our pivot, if (nums[mid] == nums[end]), we just move end forward, as the smallest number will not be removed. Otherwise if nums[mid] < nums[end], we move end to mid. In other case, we move start to mid. 