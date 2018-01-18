Time spent : 30 min(See a little hint)

Solution : Memorization + Dynamic Programming

GIVEN: two words

RETURNS: minimum number of steps required to convert word1 to word2

Note:

a) Insert a character
b) Delete a character
c) Replace a character

EXAMPLES:

```
Input: "leetcode" "letcoded"
Output: 2
Explanation: Remove e, insert d
```



First we can use recursion to solve the problem. Divide and conquar.

If last two characters are the same, we can ignore the last two characters and get count of remaining strings. So we recur from length1 - 1, length2 - 1.

Else, we consider all operations. For insert, we can recur from length1, length2 - 1; for remove, we can recur from length1 - 1, length2; for replace, we can recur from length1 - 1. length2 -1. The min of three operations + 1 is the operations steps.

The time complexity for the above solution is exponential. We can see that the subproblems are solved again and again, we need to store the value. So we use dynamic programming. **** Computing subproblems again and again can be solved by constructing a temporary array that store the results of subproblems. ****

![](https://www.geeksforgeeks.org/wp-content/uploads/EditDistance.png)

int\[][] dp = new int\[len1 + 1][len2 + 1]. 

If i = 0 or j = 0, dp\[i][j] = j or i.

If two characters are the same, dp\[i][j] = dp\[i - 1][j - 1]

Otherwise, pick the min one, that is dp\[i - 1][j] for delete, dp\[i][j - 1] for insert, dp\[i - 1][j - 1] for replace