Time spent : 90min(during contest, not working)    30 min(see hint)

GIVEN: row N and index K

RETURNS: the kth indexed symbol in row N. (1-indexed)

EXAMPLES:

```
Examples:
Input: N = 1, K = 1
Output: 0

Input: N = 2, K = 1
Output: 0

Input: N = 2, K = 2
Output: 1

Input: N = 4, K = 5
Output: 1

Explanation:
row 1: 0
row 2: 01
row 3: 0110
row 4: 01101001
```

Time Complexity: O(N), we need to go through N - 1 steps

Space Complexity: O(1)

Solution 1 : Recursion (Parent Variant)

This problem cannot be solved by DP, cause it is too large when N become big.

![](https://leetcode.com/problems/k-th-symbol-in-grammar/Figures/779/link.png)

We can see that the parent of given K, is (K + 1) / 2 in last row. For example, N = 4, K = 5, parent is N = 3, K = 3, which is 1. We can also see, on the left half, the pattern is exactly same as last row. So when the parent is 0, the digit will be same as 1 - (K % 2), if the parent is 1, the digit will be K % 2.

Note: K & 1 : judge if a number is odd. ~K & 1 : judge if a number is even.

When parent is 0, if K is odd, result is 1, if K is even, result is 0.

​			   1, if K is odd, result is 0, if K is even, result is 1.

So we can use ^ to achieve the goal, cause 1 ^ 0 = 1, 0 ^ 0 = 0.

Parent digit can be called by recursive, kthGrammar(N - 1, (K + 1) / 2). Operate ^ with (~K & 1)



Solution 2 : Recursion (Flip Variant)

We can see that the left half is exactly the same as last row, and right half is flip the left half.

So K <= 1 << N - 2(half of N - 1). return kthGrammar(N - 1, K)

else, return kthGrammar(N -1, K - (1 << N - 2)) ^ 1.



Solution 3 : Binary Count

The number of times we will flip the final answer is just the number of 1s in the binary representation of  K - 1