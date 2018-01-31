Time spent : 10 min(self + see hint of last solution)

GIVEN: a non-negative integers representing an elevation map

RETURNS: how much water it is able to trap after raining



EXAMPLES:

![](https://leetcode.com/static/images/problemset/rainwatertrap.png)

```
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
```





Solution 1 : 

Brute force. For each element in the array, find the maximum level of water it can trap, which is equal to the minimum of maximum height of bars on both the sides minus its own height.