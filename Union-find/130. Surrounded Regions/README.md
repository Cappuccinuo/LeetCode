Time spent : 10 min(Self)

GIVEN: 2D board containing X and O

EFFECTS: capture all regions surrounded by X

**Example:**

```
X X X X
X O O X
X X O X
X O X X
```

After running your function, the board should be:

```
X X X X
X X X X
X X X X
X O X X
```

Algorithm:

Using union-find, the boarder element will union with the top say index 0.

Every O that is not connected to top, will turn to X.