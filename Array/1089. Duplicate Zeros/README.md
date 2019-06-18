Time spent :  10 min(Self)

GIVEN: Given a fixed length array `arr` of integers

Effects:  duplicate each occurrence of zero, shifting the remaining elements to the right.

EXAMPLES:

**Example 1:**

```
Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
```

**Example 2:**

```
Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
```

Algorithm:

If we can use other space, we can use array or queue to store the final result.

Using O(1) space, we may use two pointers. First step we count which position we stop. Then from the stop position, we move backward and fill from the end of the array.