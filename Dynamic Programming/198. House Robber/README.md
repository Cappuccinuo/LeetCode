Time spent : 20 min

Solution : IntegerArray -> Integer

GIVEN: an integer array nums

RETURNS: maximum sum, which cannot add adjacent integer

EXAMPLES:

Input: 

```
[1,2,3,4,5,6,7]
```

Output: 16

Design strategy: Dynamic Programming



1. two integers, rob means max money can get if rob current house, notrob means max money can get if not rob current house
2. robcurrent = notrob + num[i], if rob current house, must not rob previous house
3. notrob = Math.max(notrob, rob), if not rob current house, the money is the max of robbed i-1 house and not robbed i-1 house.
4. rob = robcurrent
