Time spent : 5 min(See hint)

GIVEN: integer array sorted in ascending order

RETURNS: whether you can make such a split. split them into several subsequences, where each subsequences consist of at least 3 consecutive integers.

EXAMPLES:

**Example 1:**

```
Input: [1,2,3,3,4,5]
Output: True
Explanation:
You can split them into two consecutive subsequences : 
1, 2, 3
3, 4, 5
```



**Example 2:**

```
Input: [1,2,3,3,4,4,5,5]
Output: True
Explanation:
You can split them into two consecutive subsequences : 
1, 2, 3, 4, 5
3, 4, 5
```



**Example 3:**

```
Input: [1,2,3,4,4,5]
Output: False
```

Algorithm:

1,2,3,3,4,4,5,5

[1]

[1, 2]

[1,2,3]

[3] [1,2,3]

[1,2,3] [3,4]

[3, 4] [1,2,3,4]

[1,2,3,4] [3,4,5]

[1,2,3,4,5] [3,4,5]

3 conditions: 

1. when pq.peek().end + 1 < num, we need to poll that interval
2. when pq.peek().end + 1 = num, we poll that interval, and update end
3. when pq,peek().end == num, add a new interval(num, num)

For our heap, we first sort by end, then by length, cause we always want smaller array to append, and smaller end at top.