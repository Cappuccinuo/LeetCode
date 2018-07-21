Time spent :  10 min(Self)

GIVEN: Web page area

Note:

```
1. The area of the rectangular web page you designed must equal to the given target area.

2. The width W should not be larger than the length L, which means L >= W.

3. The difference between length L and width W should be as small as possible.
```

RETURNS: the length L and the width W of the web page you designed in sequence.

**Example:**

```
Input: 4
Output: [2, 2]
Explanation: The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1]. 
But according to requirement 2, [1,4] is illegal; according to requirement 3,  [4,1] is not optimal compared to [2,2]
```

Algorithm:

The best one must be traverse from Math.sqrt(area). Find the factor.