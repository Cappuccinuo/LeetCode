Time spent : 25 min(Self)



GIVEN: a triangle

RETURNS: the minimum sum of a path

EXAMPLE: 

```
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
```

ANS: 11   2 + 3 + 5 + 1 = 11

Same idea with Unique Paths. From top to bottom.

the path at the edge we can find the sum, cause there is just one adjacent point.

```
[
     [2],
    [5,6],
   [11, ,13],
  [15, , ,16]
]
```

So as to the number in the middle, we just find the min one of the adjacent row.

Like dp\[2][1] = 5 + Math.min(5, 6) = 10

At last, sort dp\[size - 1], dp\[size - 1][0] is our answer.