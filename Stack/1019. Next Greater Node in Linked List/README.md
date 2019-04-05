Time spent :  5 min(Self)

GIVEN: We are given a linked list with `head` as the first node.  Let's number the nodes in the list: `node_1, node_2, node_3, ...` etc. Each node may have a *next larger* **value**: for `node_i`, `next_larger(node_i)` is the `node_j.val` such that `j > i`, `node_j.val > node_i.val`, and `j` is the smallest possible choice.  If such a `j` does not exist, the next larger value is `0`.

RETURNS: Return an array of integers `answer`, where `answer[i] = next_larger(node_{i+1})`.

EXAMPLES:

**Example 1:**

```
Input: [2,1,5]
Output: [5,5,0]
```

**Example 2:**

```
Input: [2,7,4,3,5]
Output: [7,0,5,5,0]
```

**Example 3:**

```
Input: [1,7,5,1,9,2,5,1]
Output: [7,9,9,9,0,5,0,0]
```

Algorithm:

Same as Daily Temperature, Next Greater Element II problem.