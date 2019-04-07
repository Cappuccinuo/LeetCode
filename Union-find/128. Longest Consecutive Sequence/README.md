Time spent :  30 min(Self)

GIVEN: Given an unsorted array of integers

RETURNS: the length of the longest consecutive elements sequence.

EXAMPLES:

```
Input: [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4
```

Algorithm:

As the algorithm should be O(n), we cannot sort the array.

First need to know the idea of consecutive, x, x + 1, x + 2...

So for a given number, how do we know it has consecutive elements - we continuously check its next element. How to know the length of the whole sequence, we need to know the head and tail. So when a number doesn't have previous number, x - 1, it can be a head. From there, we continuously check its next element, update the global max counter.

Another method is to use union-find, to group x and x - 1, x and x + 1 together. 