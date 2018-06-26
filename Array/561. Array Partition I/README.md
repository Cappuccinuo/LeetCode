Time spent :  10 min(self + see hint)

GIVEN: an array of 2n integers

RETURNS: group number of pairs of integer, which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

**Example :**

```
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
```

Algorithm:

We can sort the array, and add all the odd index number. It costs O(nlogn) time.

Or we can use bucket sort.