Time spent : 10 min

Solution : Integer -> Integer	

GIVEN: a integer indicates the scope of number

RETURNS: the number pick

EXAMPLES:

Input: 

```
10(I pick 6)
```

Output: 6

DESIGN STRATEGY: Binary Search



1. Given low = 1, high = given n.
2. while (low <= high), mid number equals to (low + (high - low) / 2)
3. through guess(mid) we can know our guess is low or high or equal. So we can adjust high and low.
