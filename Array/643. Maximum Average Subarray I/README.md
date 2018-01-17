Time spent : 10 min(Self)

GIVEN: an array consisting of n integers

RETURNS: maximum average of contiguous of given length k

EXAMPLES:

```
Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
```



DESIGN STRATEGY: 

Sliding window.

The sum from i to i + k is x. And the sum from i + 1 to i + k + 1 is x - num[i] + num[i + k + 1]