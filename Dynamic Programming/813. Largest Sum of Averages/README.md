Time spent : 40 min(See hint)

GIVEN: an array of numbers A, and a number K

RETURNS: The largest score we can get

Note: We partition a row of numbers `A` into at most `K` adjacent (non-empty) groups, then our score is the sum of the average of each group. 

**Example:**

```
Input: 
A = [9,1,2,3,9]
K = 3
Output: 20
Explanation: 
The best choice is to partition A into [9], [1, 2, 3], [9]. The answer is 9 + (1 + 2 + 3) / 3 + 9 = 20.
We could have also partitioned A into [9, 1], [2], [3, 9], for example.
That partition would lead to a score of 5 + 2 + 6 = 13, which is worse.
```



| k\i  | 0    | 1    | 2    | 3    | 4     |
| ---- | ---- | ---- | ---- | ---- | ----- |
| 0    | 9    | 5    | 4    | 3.75 | 4.8   |
| 1    | 9    | 10   | 10.5 | 11   | 12.75 |
| 2    | 9    | 10   | 12   | 13.5 | 20    |

dp\[k][i] represents the max score for numbers from 0 ~ i when partitioned to k groups.

dp\[k][i] = Math.max(dp\[k - 1][i], dp\[k - 1][j] + (sum[i] - sum[j]) / (i - j))    for every j from 0 to i