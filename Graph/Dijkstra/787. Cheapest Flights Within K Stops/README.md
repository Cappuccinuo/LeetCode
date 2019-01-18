Time spent :  20 min(See hint)

GIVEN: N cities connected by m flights. Each fight starts from city `u `and arrives at `v` with a price `w`. Now given all the cities and flights, together with starting city `src` and the destination `dst`,

RETURNS: the cheapest price from `src` to `dst` with up to `k` stops. If there is no such route, output `-1`.

EXAMPLES:

```
Example 1:
Input: 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 1
Output: 200
Explanation: 
The graph looks like this:
https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png

The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.
Example 2:
Input: 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 0
Output: 500
Explanation: 
The graph looks like this:
https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png

The cheapest price from city 0 to city 2 with at most 0 stop costs 500, as marked blue in the picture.
```

Algorithm:

Dijikstra. We need another field for int[] in priority queue, that is stop. When stop is > 0, we offer new int[] into heap.