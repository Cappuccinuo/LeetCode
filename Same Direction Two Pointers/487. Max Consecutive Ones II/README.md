Time spent :  5 min(Self)

GIVEN: Array filled with 0 and 1

RETURNS: find the maximum number of consecutive 1s in this array if you can flip at most one 0.

EXAMPLES:

**Example 1:**

```
Input: [1,0,1,1,0]
Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.
```

Algorithm:

Sliding window, ensure the 0 use is smaller than k.

**Follow up:**
What if the input numbers come in one by one as an **infinite stream**? In other words, you can't store all numbers coming from the stream as it's too large to hold in memory. Could you solve it efficiently?

Using queue to store zeroIndex.