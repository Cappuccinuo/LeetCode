Time spent : 5 min(Self)

GIVEN: an array A of 0s and 1s, we may change up to K values from 0 to 1.

RETURNS: Return the length of the longest (contiguous) subarray that contains only 1s. 

EXAMPLES:

**Example 1:**

```
Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
Output: 6
Explanation: 
[1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
```

**Example 2:**

```
Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
Output: 10
Explanation: 
[0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
```

Algorithm:

The meaning of the problem is that we may tolerate K '0' in our substring, to make our substring of '1' longest. 