Time spent :  20 min(Self)

GIVEN: Given a matrix of M x N elements (M rows, N columns)

RETURNS: return all elements of the matrix in diagonal order as shown in the below image.

EXAMPLES:

**Example:**

```
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output:  [1,2,4,7,5,3,6,8,9]

```

Algorithm:

1. We need to change direction every time we hit the bound
2. When the index is not inbound, we need to adjust the index. 

i < 0 -> definitely 0 next step

i >= m -> definitely m - 1 next step, j need to be j + 2

j < 0 -> definitely 0 next step

j >= n -> definitely n - 1 next step, i need to be i + 2

 