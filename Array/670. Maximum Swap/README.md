Time spent :  10 min(See hint)

GIVEN: Given a non-negative integer, you could swap two digits **at most** once to get the maximum valued number. 

RETURNS: the maximum valued number you could get.

EXAMPLES:

**Example 1:**

```
Input: 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
```



**Example 2:**

```
Input: 9973
Output: 9973
Explanation: No swap.
```

Algorithm:

Record the last position of digit from 1 - 9. And traverse from left to right, if the larger digit's index is larger than current index, just swap the two digit.