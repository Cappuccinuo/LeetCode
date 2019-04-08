Time spent :  5 min(Self)

GIVEN: In a string composed of `'L'`, `'R'`, and `'X'` characters, like `"RXXLRXRXL"`, a move consists of either replacing one occurrence of `"XL"` with `"LX"`, or replacing one occurrence of `"RX"` with `"XR"`. Given the starting string `start` and the ending string `end`

RETURNS: return `True` if and only if there exists a sequence of moves to transform one string to the other.

EXAMPLES:

```
Input: start = "RXXLRXRXL", end = "XRLXXRRLX"
Output: True
Explanation:
We can transform start to end following these steps:
RXXLRXRXL ->
XRXLRXRXL ->
XRLXRXRXL ->
XRLXXRRXL ->
XRLXXRRLX
```

Algorithm:

First check if we replace X to "", if the start and end is equals.

Then we can find that LX cannot -> XL, XR cannot -> RX. So Use to pointer, to check the position of L and R of start and end.

If the char is R, if i > j, return false.

e.g. 

XR

RX

If the char is L, if i < j, return false.

e.g.

LX

XL