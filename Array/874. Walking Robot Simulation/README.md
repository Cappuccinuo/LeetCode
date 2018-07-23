Time spent : 15 min(see hint)

GIVEN: commands array and obstacles array

RETURNS: the square of the maximum Euclidean distance that the robot will be from the origin



**Example 1:**

```
Input: commands = [4,-1,3], obstacles = []
Output: 25
Explanation: robot will go to (3, 4)
```

**Example 2:**

```
Input: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
Output: 65
Explanation: robot will be stuck at (1, 4) before turning left and going to (1, 8)
```

 

Algorithm:

Add the obstacles as string and add them in the hashset. We need to have an variable direction to indicate the direction.