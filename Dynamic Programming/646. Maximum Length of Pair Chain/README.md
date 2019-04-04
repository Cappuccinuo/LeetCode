Time spent :  10 min(Self + See hint)

GIVEN: You are given `n` pairs of numbers. In every pair, the first number is always smaller than the second number. Now, we define a pair `(c, d)` can follow another pair `(a, b)` if and only if `b < c`. Chain of pairs can be formed in this fashion.

RETURNS: length longest chain which can be formed

EXAMPLES: 

```
Input: [[1,2], [2,3], [3,4]]
Output: 2
Explanation: The longest chain is [1,2] -> [3,4]
```

Algorithm:

Dynamic Programming:

Sort by start time. Kind like pattern of longest continuous increasing subsequence.

Greedy:

Sort by end time. Continuously increase ans when pair[0] > previous [1].