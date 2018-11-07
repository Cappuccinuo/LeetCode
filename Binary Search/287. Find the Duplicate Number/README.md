Time spent : 15 min (Self)

GIVEN: an array nums containing n + 1 integers where each integer is between 1 and n (inclusive)

RETURNS: the duplicate number

EXAMPLES:

Input: 

```
nums = [1, 5, 4, 3, 2, 3]
```

Output: 3

DESIGN STRATEGY: Binary Search

Actually the problem is to find the first num that "smaller than or equal to (num) > num"

We can find that for the example nums, for 1, we have soe(smaller than or equal to num) == 1, for 5, soe == 5, for 4, soe == 4, for 3, soe == 4, which is larger than itself, so our result is 3. 

For this problem, we can actully draw the picture.

