Time spent : 5  min(self)

GIVEN: `A[i]` is the size of the `i`-th bar of candy that Alice has, and `B[j]` is the size of the `j`-th bar of candy that Bob has.

RETURNS: Return an integer array `ans` where `ans[0]` is the size of the candy bar that Alice must exchange, and `ans[1]` is the size of the candy bar that Bob must exchange.

EXAMPLES:

**Example 1:**

```
Input: A = [1,1], B = [2,2]
Output: [1,2]
```

**Example 2:**

```
Input: A = [1,2], B = [2,3]
Output: [1,2]
```

**Example 3:**

```
Input: A = [2], B = [1,3]
Output: [2,3]
```

**Example 4:**

```
Input: A = [1,2,5], B = [2,4]
Output: [5,4]
```

Algorithm:

Sa - x + y = Sb -y + x, y = x + (Sb - Sa) / 2