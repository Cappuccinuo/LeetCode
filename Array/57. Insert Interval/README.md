Time spent :  15 min(Self)

GIVEN: a set of non-overlapping intervals

RETURNS: insert a new interval into the intervals and return the final intervals(merge if necessary)

EXAMPLES:

**Example 1:**

```
Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
```

**Example 2:**

```
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
```

Algorithm:

We need to know the insert position of that interval. So we need to use a field to record that.

if current interval's start is larger than newInterval's end, we just add interval to result.

If current interval's end is smaller than newInterval's start, we add interval to result, and move insertPos right.

Else we replace newInterval's start as Math.min(interval.start, newInterval.start) and max for end.