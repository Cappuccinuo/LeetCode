Time spent :  5 min(Self)

Design a data structure that supports the following two operations:

- void addNum(int num) - Add a integer number from the data stream to the data structure.
- double findMedian() - Return the median of all elements so far.

**Example:**

```
addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3) 
findMedian() -> 2
```

Algorithm:

Using two heaps, one maxHeap, one minHeap. 

When maxHeap size is 0, or incoming number is smaller than maxHeap top, add it to maxHeap. Otherwise add it to minHeap. After that, we need to balance the two heap, make maxHeap at least equal to minHeap size or = minHeap size + 1. So that the top of maxHeap and minHeap are guranteed to calculate the median.