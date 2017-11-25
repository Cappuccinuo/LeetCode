Time spent : 10 min

Solution : Array -> Boolean

GIVEN: an array of meeting time intervals consisting of start and end times `[[s1,e1],[s2,e2],...]` (si < ei)

RETURNS: true if a person could attend all meetings.

EXAMPLES:

Input: 

```
[[0, 30],[5, 10],[15, 20]]
```

Output: false



DESIGN STRATEGY: Sort



1. Use Arrays.sort to sort the array first based on interval's start time. Ascending former - after one, descending after - former one. 

           Arrays.sort(intervals, new Comparator<Interval>() {
               public int compare(Interval i1, Interval i2) {
                   return i1.start - i2.start;
               }
           });

2. traverse the array, if interval[i - 1].end > interval[i].start, then return false
