Time spent : 30 min

Solution : Stack

GIVEN: a integer array

RETURNS: the final collision array

EXAMPLES:

```
Input: 
asteroids = [5, 10, -5]
Output: [5, 10]
Explanation: 
The 10 and -5 collide resulting in 10.  The 5 and 10 never collide.

Input: 
asteroids = [8, -8]
Output: []
Explanation: 
The 8 and -8 collide exploding each other.

Input: 
asteroids = [10, 2, -5]
Output: [10]
Explanation: 
The 2 and -5 collide resulting in -5.  The 10 and -5 collide resulting in 10.

Input: 
asteroids = [-2, -1, 1, 2]
Output: [-2, -1, 1, 2]
Explanation: 
The -2 and -1 are moving left, while the 1 and 2 are moving right.
Asteroids moving the same direction never meet, so no asteroids will meet each other.
```

DESIGN STRATEGY: Stack



Say we have our answer as a stack with rightmost asteroid `top`, and a `new` asteroid comes in. If `new` is moving right (`new > 0`), or if `top` is moving left (`top < 0`), no collision occurs.

Otherwise, if `abs(new) < abs(top)`, then the `new` asteroid will blow up; if `abs(new) == abs(top)` then both asteroids will blow up; and if `abs(new) > abs(top)`, then the `top` asteroid will blow up (and possibly more asteroids will, so we should continue checking.)



Note:

we can define our own code block, like 

collision: {

​	…break collision.

}