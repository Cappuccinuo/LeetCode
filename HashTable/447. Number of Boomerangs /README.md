Time spent : 20min(see little hint)

GIVEN: *n* points in the plane that are all pairwise distinct

RETURNS: the number of boomerangs

Note: a "boomerang" is a tuple of points `(i, j, k)` such that the distance between `i` and `j` equals the distance between `i` and `k` (**the order of the tuple matters**).

**Examples:**

```
Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
```


1. Distance as the key. If key already exists, result += 2 * val.
2. Traverse all points with the other points. After one traverse, clear the map.