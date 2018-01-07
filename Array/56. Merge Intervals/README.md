Time spent : 10 min (Self + see hint)

GIVEN: a collection of intervals

RETURNS: the merged array that merge all overlapping intervals

EXAMPLES:

Input: 

```
[1,3],[2,6],[8,10],[15,18]
```

Output:[1,6],[8,10],[15,18]



Use sort to first sort all the intervals.

    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval i1, Interval i2) {
            return i1.start < i2.start ? -1 : i1.start == i2.start ? 0 : 1;
        }
    }
Go through the intervals. If last one's end is smaller than current interval's start, then add current interval.

Otherwise change last interval's end to the max of last interval's end or current interval's end.

