Time spent :  5 min(self)

GIVEN: An interval list which are flying and landing time of the flight

RETURNS: The number of airplanes are on the sky at most 

EXAMPLES:

```
[
  (1,10),
  (2,3),
  (5,8),
  (4,7)
]
```

Return `3`

Draw a picture. Make a class of Point.

To deal with the point that has same time of start and end, mark start as +1, mark end as -1. And landing will occur first.