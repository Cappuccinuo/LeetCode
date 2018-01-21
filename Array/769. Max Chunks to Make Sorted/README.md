Time spent : 10 min(See a little hint)

GIVEN: an array that is a permutation of [1,2,3,….,arr.length - 1]

RETURNS: the maximum chunks to make the array sorted

Note: we split the array into some number of "chunks" (partitions), and individually sort each chunk.  After concatenating them, the result equals the sorted array.

EXAMPLES:

```
Input: arr = [4,3,2,1,0]
Output: 1
Explanation:
Splitting into two or more chunks will not return the required result.
For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.

```

```
Input: arr = [1,0,2,3,4]
Output: 4
Explanation:
We can split into two chunks, such as [1, 0], [2, 3, 4].
However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.
```

DESIGN STRATEGY: 

For the array like 6,5,8,7,4,3,2,0,1 we can see that once 8 is at index 2, there is no way to make several chunks of next number, and 6,5 are all larger than 4,3,2,0,1. So what we need to do is find the current maximum number, and compare the number with the i. If the number == i and it is the max one now, we can make it a chunk.