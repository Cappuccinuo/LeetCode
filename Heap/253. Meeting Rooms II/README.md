Time spent :  15 min(See hint)

GIVEN: an array of meeting time intervals consisting of start and end times

RETURNS: the minimum number of conference rooms required

EXAMPLES:

**Example 1:**

```
Input: [[0, 30],[5, 10],[15, 20]]
Output: 2
```

**Example 2:**

```
Input: [[7,10],[2,4]]
Output: 1
```

Algorithm:

First sort the intervals array with start time, and initiate a heap, which sort by end time.

Everytime we poll the top of the heap, if the current interval's start is larger than the pop one's end, that means they can use the same room, we update the end to current interval's end. Else we offer the current interval in heap. Don't forget to offer the updated one in heap.