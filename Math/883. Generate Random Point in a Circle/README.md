Time spent :  10 min(see hint)

GIVEN: the radius and x-y positions of the center of a circle.

RETURNS: a function randPoint which generates a uniform random point in the circle

EXAMPLES:

**Example 1:**

```
Input: 
["Solution","randPoint","randPoint","randPoint"]
[[1,0,0],[],[],[]]
Output: [null,[-0.72939,-0.65505],[-0.78502,-0.28626],[-0.83119,-0.19803]]
```

**Example 2:**

```
Input: 
["Solution","randPoint","randPoint","randPoint"]
[[10,5,-7.5],[],[],[]]
Output: [null,[11.52438,-8.33273],[2.46992,-16.21705],[11.13430,-12.42337]]
```

Algorithm:

Rejection Sampling: Randomly generate points in a square to get random points in a circle.

![Square_Circle_Overlay](https://leetcode.com/problems/generate-random-point-in-a-circle/Figures/883/squareCircleOverlay.png)A square of size length 2R overlaid with a circle of radius R.