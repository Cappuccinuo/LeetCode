Time spent :  20 min(Self)

GIVEN: an array of integers, for each integer `A[i]` we may choose any `x` with `-K <= x <= K`, and add `x` to `A[i]`.

After this process, we have some array `B`.

RETURNS: the smallest possible difference between the maximum value of B and the minimum value of B

EXAMPLES:

**Example 1:**

```
Input: A = [1], K = 0
Output: 0
Explanation: B = [1]
```

**Example 2:**

```
Input: A = [0,10], K = 2
Output: 6
Explanation: B = [2,8]
```

**Example 3:**

```
Input: A = [1,3,6], K = 3
Output: 0
Explanation: B = [3,3,3] or B = [4,4,4]
```

Algorithm:

We can iterate the array to get the max number and min number. We want them get closer.

If max - K can be equal as min + K, than the result is 0. 

If max - K is larger than min + K, than the result is max - min - 2K.

If max - K is smaller than min + K, than we don't have to add K to min and substract K from max, we can make them equal with num smaller than K. 

So the result is Math.max(0, max - min - 2K)