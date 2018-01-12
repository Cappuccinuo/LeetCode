Time spent : 5 min (see hint)

GIVEN: a non-empty integer array of size n

RETURNS: minimum number of moves required to make all array element equal

Note: a move is incrementing a selected element by 1 or decrementing a selected element by 1.

EXAMPLES:

```
Input:
[1,2,3]

Output:
2

Explanation:
Only two moves are needed (remember each move increments or decrements one element):

[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
```

moves=∑i=0n−1∣median−nums[i]∣ , where nn is the size of the given array.

We can also use two pointers to find the result without using median.