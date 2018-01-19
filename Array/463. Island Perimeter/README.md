Time spent : 10 min(See a little hint)

GIVEN: two-D array

RETURNS: island perimeter

Note: 1 is island, 0 is water

EXAMPLES:

```
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
Explanation: The perimeter is the 16 yellow stripes in the image below:

```

![](https://leetcode.com/static/images/problemset/island.png)

DESIGN STRATEGY: 

Go through the array.

Once we come across a 1, we add 4 to the perimeter.

If i > 0 || j > 0 && arr[i - 1][j] == 1 || arr[i][j - 1] == 1, we know that there is a island neighbour. we sustract 2 from the perimeter. (2 * 4 - 2) = 6