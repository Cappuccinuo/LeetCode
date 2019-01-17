Time spent :  30 min(See hint)

GIVEN: An array flowers consists of number from 1 to N. Each number in the array represents the place where the flower will open in that day. And k.

RETURNS: in which day there exists two flowers in the status of blooming, and also the number of flowers between them is `k` and these flowers are not blooming.

EXAMPLES

**Example 1:**

```
Input: 
flowers: [1,3,2]
k: 1
Output: 2
Explanation: In the second day, the first and the third flower have become blooming.
```



**Example 2:**

```
Input: 
flowers: [1,2,3]
k: 1
Output: -1
```

Algorithm:

Simulate the process using a sorted structure.

For example, [5, 6, 3, 7, 2, 1, 4] k = 1

First day, the flower open at 5.

Second day, the flower open at 6.

Third day, the flower open at 3, which have place 4 between 3 and 5, not blooming. Return 3.

So we use treeset's function lower and higher to get the closest neighbour of current flower place.