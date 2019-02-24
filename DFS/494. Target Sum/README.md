Time spent :  5 min(Self)

GIVEN: a list of non-negative integers. Now you have 2 symbols `+` and `-`. For each integer, you should choose one from `+` and `-` as its new symbol.

RETURNS: Find out how many ways to assign symbols to make sum of integers equal to target S.

EXAMPLES:

**Example 1:**

```
Input: nums is [1, 1, 1, 1, 1], S is 3. 
Output: 5
Explanation: 

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

There are 5 ways to assign symbols to make the sum of nums be target 3.
```

Algorithm:

The same idea with the letter combination of phone number. Just two condition + and -