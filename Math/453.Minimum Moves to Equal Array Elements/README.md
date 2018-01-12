Time spent : 10 min (see hint)

GIVEN: a non-empty integer array of size n

RETURNS: minimum number of moves required to make all array element equal

Note: the move is incrementing n - 1 elements by 1.

EXAMPLES:

```
Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
```

First sort the array. Record the smallest element, nums[0].

We can find the pattern that count += nums[i] - nums[0]



To reduce the time to sort, we can go through the nums array and record the minimum one, and go through the nums array again, add nums[i] - min.


