Time spent : 10 min(self)

GIVEN: an unsorted array of integers

RETURNS: The length of longest continuous increasing subsequence(subarray)

**Example 1:**

```
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 

```

**Example 2:**

```
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
```



Sliding window

Every increasing subsequence is disjoint, and the boundary of each such subsequence occurs whenever nums[i - 1] >= nums[i]. When it does, it marks the start of a new increasing subsequence at nums[i], and we store such i in the variable anchor.



Time complexity: O(N)

Space complexity: O(1)