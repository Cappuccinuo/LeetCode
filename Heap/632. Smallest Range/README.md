Time spent :  15 min(Self + see hint)

GIVEN: k lists of sorted integers in ascending order

RETURNS: the **smallest** range that includes at least one number from each of the `k`lists.

Note: We define the range [a,b] is smaller than range [c,d] if `b-a < d-c` or `a < c` if `b-a == d-c`.

**Example 1:**

```
Input:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
Output: [20,24]
Explanation: 
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].
```

Algorithm:

My first solution is to using a heap to store int[]{row, col}. Which will sort by value. While this solution will be very slow cause we need to track min and max by Collections.max and Collections.min.

How about we store both val, row, col in the heap sort by val, and just track max value. In this way, what we extract is just the min val. When we extract the element, we add the element after it in the same row, and the heap size is always K, in this way, we can ensure that the range will cover each row at least one number.

Time complexity: O(mnlogn)   n is the size of list, m is the number of elements