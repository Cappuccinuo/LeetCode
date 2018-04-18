Time spent : 25 min(see hint)

GIVEN: an array

RETURNS: contiguous subarray's largest sum

EXAMPLES:

Input: 

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Output: 6 ([4, -1, 2, 1])



Divide-and-conquer method.

The maximum summation of subarray can only exists under following conditions:

1. the maximum summation of subarray exists in left half.
2. the maximum summation of subarray exists in right half.
3. the maximum summation of subarray exists crossing the midpoints to left and right. 

1 and 2 can be reached by using recursive calls to left half and right half of the subarraies. 
Condition 3 can be found starting from the middle point to the left, then starting from the middle point to the right. Then adds up these two parts and return. 

        T(n) = 2*T(n/2) + O(n)
        this program runs in O(nlogn) time


Dynamic Programming

1. if current sum is smaller than 0, use nums[i]; otherwise sum = sum + nums[i]
2. if the sum is larger than result, result = sum



-9 -2 18 7 -6 4 9 -9 -5 0 5 -2 5 9 7

If max = -9, dp[0] = -9. Then dp[1] = -2, cause dp[0] < 0, max = -2.

Then dp[2] = 18, cause dp[1] = -2 < 0, max = 18….