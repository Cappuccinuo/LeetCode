Time spent :  20 min(See hint)

GIVEN: An integer matrix

RETURNS: the longest increasing continuous subsequence in this matrix



**Example 1:**

Given a matrix:

```
[
  [1 ,2 ,3 ,4 ,5],
  [16,17,24,23,6],
  [15,18,25,22,7],
  [14,19,20,21,8],
  [13,12,11,10,9]
]
```

return `25`



Algorithm:

We need to do DFS for every single point, for every point we can get a longest continuous subsequence. Instead of calculate duplicate for some time, we can store the value into a matrix array, memo. So that time when we traverse to that point, we can just get the value.