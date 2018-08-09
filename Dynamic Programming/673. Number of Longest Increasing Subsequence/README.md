Time spent :  20 min(See hint)

GIVEN: an unsorted array of integers

RETURNS: the number of longest increasing subsequence

EXAMPLES:

**Example 1:**

```
Input: [1,3,5,4,7]
Output: 2
Explanation: The two longest increasing subsequence are [1, 3, 4, 7] and [1, 3, 5, 7].
```

**Example 2:**

```
Input: [2,2,2,2,2]
Output: 5
Explanation: The length of longest continuous increasing subsequence is 1, and there are 5 subsequences' length is 1, so output 5. 
```

Algorithm:

Suppose the array ends at nums[i], the length[i] (The longest subsequence to i), the count[i] (The number of subsequence with same length).

For each j < i, if we found number[j] < nums[i], then the length and count might change.

When length[i] is smaller than length[j], that meas there is a longer subsequence. So length[i] = length[j] + 1. And the count[i] becomes count[j].

When length[i] equals to length[j] + 1, that means there is another new subsequences  with length[i]. So count[i] += count[j].

At last, we can find the longest length, and for each length[i], we add count[i] to ans.