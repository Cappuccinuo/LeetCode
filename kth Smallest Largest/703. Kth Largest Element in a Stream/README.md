Time spent :  15 min(see little hint)

Design a class to find the **k**th largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

EXAMPLES:

```
int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);   // returns 4
kthLargest.add(5);   // returns 5
kthLargest.add(10);  // returns 5
kthLargest.add(9);   // returns 8
kthLargest.add(4);   // returns 8
```

Algorithm:

Using heap(min-heap). If heap's size is smaller than k, or add val is larger than heap.peek(), add val. While the heap size is larger than k, poll the heap.