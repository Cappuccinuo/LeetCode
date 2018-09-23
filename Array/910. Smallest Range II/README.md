Time spent :  15min(have little thought, see hint)

GIVEN: Given an array `A` of integers, for each integer `A[i]` we need to choose **either x = -K or x = K**, and add `x` to `A[i] **(only once)**`.

After this process, we have some array `B`.

RETURNS: the smallest possible difference between the maximum value of `B` and the minimum value of `B`.

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
Output: 3
Explanation: B = [4,6,3]
```

Algorithm:

For an array like [1, 3, 4, 7]， we can somewhat split the array into two parts, one parts all add K, one parts all subtract K, like (1, 3) + K, (4, 7) - K. For every this split, we can get max - min.

We sort the array first. Then we traverse the array from index 0 to N - 2, a = A[i], b = A[i + 1]. So the max is a + K, or A[N - 1] - K, same for min, is b - K or A[0] + K. Every time we compare the max - min with our ans and choose the smallest one.