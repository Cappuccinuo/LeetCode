Time spent : 3 min(See a little hint)

GIVEN: permutation A of [0, 1, …, N - 1], where N is the length of A

RETURNS: true iff the number of global inversions is equal to the number of local inversions

Note: The number of (global) inversions is the number of `i < j` with `0 <= i < j < N` and `A[i] > A[j]`.

The number of local inversions is the number of `i` with `0 <= i < N` and `A[i] > A[i+1]`.

EXAMPLES:

```
Input: A = [1,0,2]
Output: true
Explanation: There is 1 global inversion, and 1 local inversion.

```

```
Input: A = [1,2,0]
Output: false
Explanation: There are 2 global inversions, and 1 local inversion.
```



[Algorithm][https://leetcode.com/problems/global-and-local-inversions/solution/]:

1. We want to check whether there is some j >= i + 2 for which A[i] > A[j]. **This is the same as checking for A[i] > min A[i+2: ]**. So we iterate A from right to left, remember the current minima called floor. If A[i - 2] > floor, that case global and local inversion must not equal, like [2, 1, 0], return false. 

2. Second solution is check A[i] with i. If 0 occurs at index 2 or greater, then there must be non-local inversion. So 0 can only occur at index 0 or 1. If A[1] = 0, then A[0] must be 1, or A[0] > A[j] = 1 is not a local inversion. Therefore, the possibilities are 

   A = [0] + (ideal permutation of 1…N-1)

   or

   A = [0, 1] + [ideal permutation of 2…N-1]

   A necessary and sufficient condition for these possibilities is that Math.abs(A[i] - i) <= 1. So we check this for every i.

