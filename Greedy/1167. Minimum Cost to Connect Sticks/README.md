Time spent :  5 min(Self)

GIVEN: You have some `sticks` with positive integer lengths.

You can connect any two sticks of lengths `X` and `Y` into one stick by paying a cost of `X + Y`.  You perform this action until there is one stick remaining.

RETURNS: the minimum cost of connecting all the given `sticks` into one stick in this way.

EXAMPLES:

**Example 1:**

```
Input: sticks = [2,4,3]
Output: 14
```

**Example 2:**

```java
Input: sticks = [1,8,3,5]
Output: 30
```

Algorithm:

Just greedily add the minimum length 2 sticks.