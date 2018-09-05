Time spent : 15 min(Self)

GIVEN: a char array and a number n

RETURNS: the least number of intervals the CPU will take to finish all the given tasks

EXAMPLES:

```
Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
```

Algorithm:

List A-Z greedily, if interval is not enough, add idle.