Time spent :  15 min(See hint)

GIVEN:  an array A of integers

RETURNS: the length of the longest mountain

EXAMPLES:

**Example 1:**

```
Input: [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
```

**Example 2:**

```
Input: [2,2,2]
Output: 0
Explanation: There is no mountain.
```

Algorithm:

Use two pointers left and right.

Start from left, right = left, first start at the point which smaller than next point. Then during the traverse, we increase right. When x > x + 1, we stop and keep tracking if the point is actually a mountain. In this judgement block, we update our answer.