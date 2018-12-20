Time spent :  3 min(Self)

GIVEN: Two arrays

RETURNS: their intersection

EXAMPLES: 

**Example 1:**

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
```

**Example 2:**

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
```

Algorithm:

Using two hashset. One record all the num in nums1, one record the result. Every time for num in nums2, if set contains that num, add that num to result set. At last, we transfer the set to array.