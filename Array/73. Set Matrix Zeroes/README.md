Time spent :  10 min(Self)

GIVEN: a m * n matrix. 

RETURNS: If an element is 0, set its entire row and column to 0. Do it in-place

EXAMPLES:

**Example 1:**

```
Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
```

**Example 2:**

```
Input: 
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output: 
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
```

Algorithm:

Set a flag = -10000.

If we come into an element which is 0, we set its row and column to flag(If the element is not 0).

At last we change the flag to 0.

For example 2.

[
[0,-10000,-10000,0],
[-10000,4,5,-10000],
[-10000,3,1,-10000]
]

