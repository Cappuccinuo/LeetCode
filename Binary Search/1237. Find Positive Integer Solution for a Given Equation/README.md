Time spent :  15 min(Self)

GIVEN: Given a function `f(x, y)` and a value `z`

RETURNS: return all positive integer pairs `x` and `y` where `f(x,y) == z`.

The function interface is defined like this: 

```
interface CustomFunction {
public:
  // Returns positive integer f(x, y) for any given positive integer x and y.
  int f(int x, int y);
};
```

For custom testing purposes you're given an integer `function_id` and a target `z` as input, where `function_id` represent one function from an secret internal list, on the examples you'll know only two functions from the list.  

You may return the solutions in any order.

EXAMPLES:

**Example 1:**

```
Input: function_id = 1, z = 5
Output: [[1,4],[2,3],[3,2],[4,1]]
Explanation: function_id = 1 means that f(x, y) = x + y
```

**Example 2:**

```
Input: function_id = 2, z = 5
Output: [[1,5],[5,1]]
Explanation: function_id = 2 means that f(x, y) = x * y
```

Algorithm:

O(i + j) / O(ilogj)

Using two pointers, one from i = 1, one from j = 1000.

Or fix i, traverse i from 1 to 1000. And using binary search to search for value of j.