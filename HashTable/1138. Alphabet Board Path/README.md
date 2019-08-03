Time spent : 20 min

GIVEN: On an alphabet board

![img](https://assets.leetcode.com/uploads/2019/07/28/azboard.png)

RETURNS:

We may make the following moves:

- `'U'` moves our position up one row, if the position exists on the board;
- `'D'` moves our position down one row, if the position exists on the board;
- `'L'` moves our position left one column, if the position exists on the board;
- `'R'` moves our position right one column, if the position exists on the board;
- `'!'` adds the character `board[r][c]` at our current position `(r, c)` to the answer.

Return a sequence of moves that makes our answer equal to `target` in the minimum number of moves.  You may return any path that does so.

EXAMPLES:

**Example 1:**

```
Input: target = "leet"
Output: "DDR!UURRR!!DDD!"
```

**Example 2:**

```
Input: target = "code"
Output: "RR!DDRR!UUL!R!"
```

**Example 3:**

```
Input: target = "zb"
Output: "DDDDD!UUUUUR!"
```

Algorithm:

Pay special attention to letter 'z'. The path to 'z' may not on the board if we only care about the distance.

First we can store all the characters in hashmap, or we can use position to calculate the character, which will use O(1) space.

Then for each position, we move close to the next position. If we move downward, and touch the boarder above 'Z', we need to stop and move horizontally.