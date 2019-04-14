Time spent :  20 min(Self + see hint)

GIVEN: Given an array *nums*, there is a sliding window of size *k* which is moving from the very left of the array to the very right. You can only see the *k* numbers in the window. Each time the sliding window moves right by one position.

RETURNS: output the median array for each window in the original array.

EXAMPLES:

Given *nums* = `[1,3,-1,-3,5,3,6,7]`, and *k* = 3.

```
Window position                Median
---------------               -----
[1  3  -1] -3  5  3  6  7       1
 1 [3  -1  -3] 5  3  6  7       -1
 1  3 [-1  -3  5] 3  6  7       -1
 1  3  -1 [-3  5  3] 6  7       3
 1  3  -1  -3 [5  3  6] 7       5
 1  3  -1  -3  5 [3  6  7]      6
```

Therefore, return the median sliding window as `[1,-1,-1,3,5,6]`.

Algorithm:

To know the median of currently subarray in window, we need to know the middle one or two elements after sort the subarray. To know that, we can maintain two heap, one maxheap, and one minheap. Suppose the maxheap's top is x, then we push all the numbers larger than x to minheap, so that the top of minheap is the number exactly larger than x. After the size larger than k, we remove the previous number from either maxheap or minheap. 



Of course every time we need to balance two heap, cause we need to at least let maxheap.size == minheap.size or maxheap.size + 1 == minheap.size.