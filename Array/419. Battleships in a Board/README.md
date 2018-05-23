Time spent : 10 min

GIVEN: a 2D board array

RETURNS: the number of battleships in it



Note: The battleships are represented with `'X'`s, empty slots are represented with `'.'`s. You may assume the following rules:

- You receive a valid board, made of only battleships or empty slots.
- Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape `1xN` (1 row, N columns) or `Nx1` (N rows, 1 column), where N can be of any size.
- At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.



EXAMPLES:

Input: 

```
X..X
...X
...X
```

Output: 2



Go through each number on the board.(i - 1, j) or (i, j - 1) is 'X' or (i, j) is '.', then don't add count. That's because the battleship can only vertically or horizontally set.