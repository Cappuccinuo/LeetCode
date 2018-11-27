Time spent : 2 min(Self)

GIVEN: A time t

RETURNS: Write class RecentCounter

Note:

Write a class `RecentCounter` to count recent requests.

It has only one method: `ping(int t)`, where t represents some time in milliseconds.

Return the number of `ping`s that have been made from 3000 milliseconds ago until now.

Any ping with time in `[t - 3000, t]` will count, including the current ping.

EXAMPLES:

```
Input: inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]]
Output: [null,1,2,3,3]
```

Algorithm:

Using deque. Every time we offer current t to deque, and poll all the time smaller than t - 3000 from front.