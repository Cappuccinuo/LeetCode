Time spent : 5 min(See hint)

GIVEN: stones on a number line at positions a, b, c

RETURNS:  minimum and maximum number of moves that you could have made

Note: each turn, pick up stone at endpoint, move it to unoccupied position between endpoints. At last, the stones are consecutive.

EXAMPLES: **Example 1:**

```
Input: a = 1, b = 2, c = 5
Output: [1,2]
Explanation: Move the stone from 5 to 3, or move the stone from 5 to 4 to 3.
```

**Example 2:**

```
Input: a = 4, b = 3, c = 2
Output: [0,0]
Explanation: We cannot make any moves.
```

**Example 3:**

```
Input: a = 3, b = 5, c = 1
Output: [1,2]
Explanation: Move the stone from 1 to 4; or move the stone from 1 to 2 to 4.
```

Algorithm:

Key point is find the relationship between max, middle and min.

So we use sorted array to solve this.

If the max and min's difference is 2, the stones are already consecutive.

Otherwise, the min will be, if the min of (max - middle, middle - min) is smaller than 2, that means one of the pairs are consecutive, then the min is 1, otherwise is 2, the move is move min to middle - 1, move max to middle + 1.

the max will be max - min - 2. That is all the unoccupied positions.