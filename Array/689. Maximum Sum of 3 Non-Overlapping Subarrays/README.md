Time spent : 20 min(See hint)

GIVEN: array of nums of positive integers

RETURNS: three non-overlapping subarrays with maximum sum

Note: Each subarray will be of size k, maximize the sum of all 3 * k entries

EXAMPLES:

```
Input: [1,2,1,2,6,7,5,1], 2
Output: [0, 3, 5]
Explanation: Subarrays [1, 2], [2, 6], [7, 5] correspond to the starting indices [0, 3, 5].
We could have also taken [2, 1], but an answer of [1, 3, 5] would be lexicographically larger.
```

Algorithm:

First we need to calculate all the possible sum of window k.

For [1, 2, 1, 2, 6, 7, 5, 1] and k = 2, we get

[1, 3(1 + 2), 3(2 + 1), 3(1 + 2), 8(2 + 6), 13(6 + 7), 12(7 + 5), 6(5 + 1)] -> [1, 3, 3, 3, 8, 13, 12, 6]

Then we traverse the sum array, and get two array, left and right. left record the max sum in left, right record the max sum in right for a given index.

In the example, it is 

left(traverse from k - 1 to len - 1): [0, 1(3), 1(3), 1(3), 4(8), 5(13), 5(13), 5(13)] -> [0, 1, 1, 1, 4, 5, 5, 5]

right(traverse from len - 1 to k - 1): [0, 5(13), 5(13), 5(13), 5(13), 5(13), 6(12), 7(6)] -> [0, 5, 5, 5, 5, 5, 6, 7]

Next we need to go through all the possible k that between 2k * 1 -> len - k.

sum = sums[left[i - k]] + sums[i] + sums[right[i + k]]

choose the maximum one, and the corresponding index is left[i - k] - k + 1, i - k + 1, and right[i - k] - k + 1.