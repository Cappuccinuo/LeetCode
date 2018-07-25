Time spent :  1 min(self)

GIVEN: a sorted array consisting of only integers where every element appears twice except for one element which appears once.

RETURNS: the single element that appears only once.

EXAMPLES:

**Example 1:**

```
Input: [1,1,2,3,3,4,4,8,8]
Output: 2
```

**Example 2:**

```
Input: [3,3,7,7,10,11,11]
Output: 10
```

Algorithm:

Not O(logn) solution: Using XOR

O(logn) solution: Binary Search

Every time we check the number with even index, so we can check nums[i] and nums[i + 1].

If they are not equal, end will become mid. Otherwise we move forward 2.