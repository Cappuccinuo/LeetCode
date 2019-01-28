Time spent :  15 min(Self)

GIVEN: a row of n houses, each can be painted one of k colors. Given the 2D array, costs\[i][j] is the price of color i house with j color. Adjacent house cannot be painted the same color.

RETURNS: the minimum cost to paint all houses.

**Example:**

```
Input: [[1,5,3],[2,9,4]]
Output: 5
Explanation: Paint house 0 into color 0, paint house 1 into color 2. Minimum cost: 1 + 4 = 5; 
             Or paint house 0 into color 2, paint house 1 into color 0. Minimum cost: 3 + 2 = 5. 
```

Algorithm:

DP\[i][j] represent for i house, the minimum total cost when paint i with j color.

DP\[i][j] = DP\[i - 1][k]  (k != j) + cost\[i][j]

How to speed up?

For a given row in dp, every possibility is either minimum of last row + current cost or second minimum of last row + current cost. So what we need to do is for every given line, we keep record of the mimumum position and second minimum position.