Time spent : 10 min(See hint)

GIVEN: a 2D board and a word

RETURNS: true iff the word exists in the grid

EXAMPLES:

```
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
```

**word** = `"ABCCED"`, -> returns `true`,
**word** = `"SEE"`, -> returns `true`,
**word** = `"ABCB"`, -> returns `false`.



Cause the same letter cell can only be used once, we use a visited array to represent if the board has been used.

Use a recusion to do the backtracking. 

row and column represent the character on the board, index represents the index of word.

If word.charAt(index) != board\[row][colum], return false.

Make visited true, check row +- 1, column +- 1, index + 1.

Then make visited\[row][column] false.