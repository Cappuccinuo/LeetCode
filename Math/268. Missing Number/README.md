Time spent : 5 min(self)

GIVEN: an array containing n distinct numbers taken from 0, 1, 2, ..., n

RETURNS: the one that is missing from the array

EXAMPLES:

**Example 1:**

```
Input: [3,0,1]
Output: 2
```

**Example 2:**

```
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
```

Algorithm:

Using a hashset to put all the number in the set. The target number is num.length + 1, traverse 0 - target, if set not contains number, return number.