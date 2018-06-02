Time spent : 25min(see hint)

Solution : BFS

GIVEN: a lock with 4 circular wheels and a target

RETURNS: the minimum total number of turns required to open the lock, -1 if impossible

Note: The lock initially starts at `'0000'`, a string representing the state of the 4 wheels.

You are given a list of `deadends` dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.

**Example 1:**

```
Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
Output: 6
Explanation:
A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
because the wheels of the lock become stuck after the display becomes the dead end "0102".
```

**Example 2:**

```
Input: deadends = ["8888"], target = "0009"
Output: 1
Explanation:
We can turn the last wheel in reverse to move from "0000" -> "0009".
```

**Example 3:**

```
Input: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
Output: -1
Explanation:
We can't reach the target without getting stuck.
```

**Example 4:**

```
Input: deadends = ["0000"], target = "8888"
Output: -1
```



Intuition: Think of this problem as a shortest path problem on a graph: 10000 nodes("0000" - "9999") and there is an edge between two nodes if they differ in one digit, that digit differ by 1(0 and 9 same), and if both nodes are not in the deadends.

As for the `neighbors` function, for each position in the lock `i = 0, 1, 2, 3`, for each of the turns `d = -1, 1`, we determine the value of the lock after the `i`-th wheel has been turned in the direction `d`

In Java, our implementation also inlines the neighbors function for convenience, and uses `null` inputs in the `queue` to represent a layer change. When the layer changes, we `depth++` our global counter, and `queue.peek() != null` checks if there are still nodes enqueued.

Pay attention to the change value, we need to add 10, as 0 + (-1) will be -1 instead of 9.