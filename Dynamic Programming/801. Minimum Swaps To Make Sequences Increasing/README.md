Time spent :  15 min(See hint)

GIVEN: two integer sequences A and B

RETURNS: the minimum number of swaps to make both sequences strictly increasing.

Note: We are allowed to swap elements `A[i]` and `B[i]`.  Note that both elements are in the same index position in their respective sequences.

```
Example:
Input: A = [1,3,5,4], B = [1,2,3,7]
Output: 1
Explanation: 
Swap A[3] and B[3].  Then the sequences are:
A = [1, 3, 5, 7] and B = [1, 2, 3, 4]
which are both strictly increasing.
```

Algorithm:

`swapRecord` means for the ith element in A and B, the minimum swaps if we swap `A[i]` and `B[i]` `fixRecord` means for the ith element in A and B, the minimum swaps if we DONOT swap `A[i]` and `B[i]`