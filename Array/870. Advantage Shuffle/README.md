Time spent :  25 min(See hint)

GIVEN: two arrays A and B of equal size.

Note: the advantage of A with respect to B is the number of indices i for which A[i] > B[i].

RETURNS: Any permutations of A that maximizes its advantage with respect to B.

EXAMPLES:

**Example 1:**

```
Input: A = [2,7,11,15], B = [1,10,4,11]
Output: [2,11,7,15]
```

**Example 2:**

```
Input: A = [12,24,8,32], B = [13,25,32,11]
Output: [24,32,8,12]
```

Algorithm:

First sort array A and B.

Make a map assigned. For all number a in sortedA, if a > sortedB[j], we put a in map.get(sortedB[j]), otherwise we put that number in remain queue. 



The current smallest card to beat in `B` will always be `b = sortedB[j]`. For each card `a` in `sortedA`, we will either have `a` beat that card `b` (put `a` into `assigned[b]`), or throw `a` out (put `a` into `remaining`).