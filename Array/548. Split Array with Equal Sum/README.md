Time spent :  30 min(See hint)

GIVEN: An array with n integers

RETURNS: find if there are triplets (i, j, k) which satisfies following conditions:

1. 0 < i, i + 1 < j, j + 1 < k < n - 1
2. Sum of subarrays (0, i - 1), (i + 1, j - 1), (j + 1, k - 1) and (k + 1, n - 1) should be equal.

where we define that subarray (L, R) represents a slice of the original array starting from the element indexed L to the element indexed R.

EXAMPLES:

**Example:**

```
Input: [1,2,1,2,1,2,1]
Output: True
Explanation:
i = 1, j = 3, k = 5. 
sum(0, i - 1) = sum(0, 0) = 1
sum(i + 1, j - 1) = sum(2, 2) = 1
sum(j + 1, k - 1) = sum(4, 4) = 1
sum(k + 1, n - 1) = sum(6, 6) = 1
```

Algorithm:

This problem need us to find if there is a split, that makes four parts after split have same sum.

Solution1:

for loop, control the range we traverse, and use prefixSum to speed up the check.

Solution2:

HashMap, for first index i, if sum is the equal sum, then there must exist prefixSum 2 * sum + nums[i]. For second index j, there must exist 3 * sum + nums[i] + nums[j]. For third index k, there must exist 4 * sum + nums[i] + nums[j] + nums[k] = total.

Solution3:

We traverse the middle split, and traverse in left part and right part. If left part exist k split that makes equal sum s, then we traverse right part to see if there exists split that makes equal sum s in right part.