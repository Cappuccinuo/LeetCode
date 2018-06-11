Time spent : 15 min(See little hint)

GIVEN: an array difficulty, profit, worker. Difficulty[i] is the difficulty of the ith job, and profit[i] is the profit of the ith job.

RETURNS: The max profit we can make.

**Example 1:**

```
Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
Output: 100 
Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get profit of [20,20,30,30] seperately.
```



Consider the worker in skill order. (0 -> 1)

Combine the difficulty and profit together as a pair. And sort the array with difficulty.

Use variable temp to record the best job profit so far.