Time spent :  10 min(Self)

GIVEN: Integer x

RETURNS: the square root of x (double)

**Example 1:**

```
Given n = 2 return 1.41421356
```

Algorithm:

The difference between sqrt(x) II  and sqrt(x) is this problem needs to return double type. So we need to set a precision, for example 1e-10. 

We need to pay attention that when x is smaller than 1, we need to traverse x - 1. For example, when x is 0.01, the root is 0.1 which is larger than x.