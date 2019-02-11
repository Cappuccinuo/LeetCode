Time spent :  15 min(Self)

GIVEN: a sorted integer array without duplicates

RETURNS: the summary of its ranges

EXAMPLES:

**Example 1:**

```
Input:  [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
```

**Example 2:**

```
Input:  [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.
```

Algorithm:

Use two pointers. i record the start, and j move from head to tail.

If nums[j] + 1 == nums[j + 1], we continue move j. Otherwise if i is equal to j, that means this is single number, we add nums[i] to list, when i is not equal to j, we add nums[i] + "->" + nums[j] to list. At last, we need to update i to j + 1.