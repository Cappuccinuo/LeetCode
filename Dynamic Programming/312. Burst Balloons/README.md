Time spent : 15 min(See hint)

GIVEN: n balloons

RETURNS: the maximum coins you can collect by bursting the balloons wisely.

Note: Each balloon is painted with a number on it represented by array `nums`. You are asked to burst all the balloons. If the you burst balloon `i` you will get `nums[left] * nums[i] * nums[right]` coins. Here `left` and `right`are adjacent indices of `i`.

EXAMPLES:

**Example:**

```
Input: [3,1,5,8]
Output: 167 
Explanation: nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
             coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
```

Algorithm:

确定状态

Last step: must have a balloon burst, id is i. When i burst, left is balloon 0, right is balloon N + 1. We get 1 * ai * 1.

At this time, balloon 1 ~ i - 1 and i + 1 ~ N have burst, and get corresponding coins -> sub problem.

f\[i][j] -> The maximum we can get when i + 1 ~ j - 1 burst.

转移方程

f\[i][j] = max(1 < k < j){f\[i][k] + f\[k][j] + a[i] * a[k] * a[j]}

初始条件

f\[0][1] = f\[1][2]... = f\[N][N + 1] = 0

计算顺序

f\[0][2], f\[1][3]...f\[N - 1][N + 1]...

Final result is f\[0][N + 1]

Time complexity: O(N ^ 3)

Space complexity: O(N ^ 2)