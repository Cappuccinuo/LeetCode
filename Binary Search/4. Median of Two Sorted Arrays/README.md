Time spent :  15 min(Self)

GIVEN: Two sorted array nums1 and nums2 of size m and n

RETURNS: the median of the two sorted arrays. Time complexity should be O(log(m + n))

EXAMPLES:

**Example 1:**

```
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
```

**Example 2:**

```
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
```

Algorithm:

What we need to calculate the median?

If m + n is odd, then the median is the element rank len / 2 + 1 in the sorted combined array.

Otherwise is the average of element rank len / 2 and len / 2 + 1.



How to get the element?

We can use the property of sorted array, binary search. We need to find the number of the given rank.

But the two array are seperate, we cannot combine them together?

[1, 2]  

[3, 4]

Find the rank 2 number, is actually find the first number who has countSmallerOrEqual(nums1, number) + countSmallerOrEqual(num2, number) >= 2.

Instead binary search on the index, we binary search on 'value'.

The start is minimum between nums1[0] and nums2[0], the end is maximum between nums1[len1 - 1] and nums2[len2 - 1].

In countSmallerOrEqual, we need to find the first number > given target, the index of that number is how many elements are smaller or equal to the target.

 