Time spent :  5 min(Self)

GIVEN: N couples sit in 2N seats arranged in a row and want to hold hands. 

RETURNS: We want to know the minimum number of swaps so that every couple is sitting side by side. A *swap* consists of choosing **any** two people, then they stand up and switch seats.

EXAMPLES: 

**Example 1:**

```
Input: row = [0, 2, 1, 3]
Output: 1
Explanation: We only need to swap the second (row[1]) and third (row[2]) person.
```

**Example 2:**

```
Input: row = [3, 2, 0, 1]
Output: 0
Explanation: All couples are already seated side by side.
```

Algorithm:

UnionFind. For 'couples' seated together, we view them as a component, and couples must connected to their true person, so we union 1. true couples of person[i] and person[i + 1], 2. person[i] and person[i + 1]. 

The true connected component is N, if the connected component is N - 2, then there must be 2 swap. Imaging [0, 2, 1, 4, 3, 5] we need to swap 4, 3, then swap 2, 1, minimum is 2.

 