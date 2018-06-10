Time spent :20 min(See hint)

GIVEN: an array richer, and an array quiet

RETURNS: an array answer

richer[i] = [x, y] if person x definitely has more money than person y.

quiet[x] = q if person x has quietness q.

answer[x] = y if y is the least quiet person (that is, the person y with the smallest value of quiet[y]), among all people who definitely have equal to or more money than person x.

**Example 1:**

```
Input: richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], quiet = [3,2,5,4,6,1,7,0]
Output: [5,5,2,5,4,5,6,7]
Explanation: 
answer[0] = 5.
Person 5 has more money than 3, which has more money than 1, which has more money than 0.
The only person who is quieter (has lower quiet[x]) is person 7, but
it isn't clear if they have more money than person 0.

answer[7] = 7.
Among all people that definitely have equal to or more money than person 7
(which could be persons 3, 4, 5, 6, or 7), the person who is the quietest (has lower quiet[x])
is person 7.

The other answers can be filled out with similar reasoning.
```

Consider the directed graph with edge x -> y if y is richer than x. For each person x, we want the quietest person in the subtree at x.

Construct the graph as ArrayList<Integer>[]

DFS(person) is the quietest person in the subtree at person, it is either the person, or min(dfs(child) for child in person).

We can cache values of dfs(person) as answer[person]

Reference: [https://leetcode.com/problems/loud-and-rich/solution/]