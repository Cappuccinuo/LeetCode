Time spent : 30 min(See hint)

GIVEN: Given an unsorted array

RETURNS: find the maximum difference between the successive elements in its sorted form.

EXAMPLES:

**Example 1:**

```
Input: [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either
             (3,6) or (6,9) has the maximum difference 3.
```

**Example 2:**

```
Input: [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.
```

Algorithm:

Bucket sort. As we need to use linear time.

If we want to use linear space, we need to find another trick.

Suppose max and min is the maximum and minimum of the nums array. The maximum gap will be no smaller than ceiling((max - min) / (nums.length - 1)).

Knowing that, we can construct two array bucket with length nums.length - 1.

One is max, one is min, kth bucket stores the corresponding range of number -> min + (k - 1) gap, min + k * gap.

To know the maximum gap, we can use minBucket[i] - prevMax.