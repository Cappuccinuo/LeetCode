Time spent : 20 min(See a little hint)

GIVEN: an integer array nums

RETURNS: maximum contiguous product



EXAMPLES:

```
Input: [2,3,-2,4]
Output: 6
Explanation: 2 * 3
```

Design strategy: Dynamic Programming



Cause the product involves negative * negative = positive, so minimum negative one may become positive when come up with another negative integer.

So we use two arrays, max and min to record current max and min one.

    max[i] = Math.max(Math.max(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
    min[i] = Math.min(Math.min(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
After we finish the traverse, we can go through that array and find the maximum number.

Here I tested four versions of code.

6 ms one : get the max first, then sort the max array, return max[len - 1]

5 ms one : Use integer to track the max and min, pay attention we need to keep the record of prevMax and prevMin. Int is mutable.

4 ms one : When we go through to get max and min, we can get the result.

1 ms one : After we get max, we use a loop to get the maximum one.