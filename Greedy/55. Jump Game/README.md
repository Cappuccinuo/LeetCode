Time spent : 10 min(Self)

GIVEN: Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

RETURNS: Determine if you are able to reach the last index.

EXAMPLES:

**Example 1:**

```
Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
```

**Example 2:**

```
Input: [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum
             jump length is 0, which makes it impossible to reach the last index.
```

Algorithm:

Greedy solution. We need to check each index of the nums array, keep record of the furthest position we reach so far. The furthest should be larger or equal to current index.