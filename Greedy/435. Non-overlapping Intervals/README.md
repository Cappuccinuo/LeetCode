Time spent : 30 min(See a little hint)

GIVEN: a collection of intervals

RETURNS: the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping

**Note:**

1. You may assume the interval's end point is always bigger than its start point.
2. Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.

**Example 1:**

```
Input: [ [1,2], [2,3], [3,4], [1,3] ]

Output: 1

Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.

```

**Example 2:**

```
Input: [ [1,2], [1,2], [1,2] ]

Output: 2

Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.

```

**Example 3:**

```
Input: [ [1,2], [2,3] ]

Output: 0

Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
```



This problem has greedy optimal structure, that is, we can make a decision before subproblems solved.

1. Using Greedy Approach based on starting points

   Sort given intervals based on starting points. While considering the intervals in this ascending order of starting points, we make use of a pointer prev to keep track of the interval just included in the final list.

   There are 3 cases we will encounter.

   ![](https://leetcode.com/problems/non-overlapping-intervals/Figures/435_NonOverlapping_greedy1.JPG)

   Case I: do nothing

   Case II: pick the current one, and remove the prev one

   Case III: pick the prev one, and remove current one

2. Using Greedy Approach based on ending points

   Sort the given intervals based on the end points. When traversing the intervals, if there is an overlap exists between the previous interval and the current interval, we always drop the current interval.

   ![](https://leetcode.com/problems/non-overlapping-intervals/Figures/435_NonOverlapping_greedy3.JPG)