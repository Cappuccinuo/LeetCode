Time spent :  10 min(Self)

GIVEN: Given a string `S`

RETURNS: the number of substrings that have only **one distinct** letter.

EXAMPLES:

**Example 1:**

```
Input: S = "aaaba"
Output: 8
Explanation: The substrings with one distinct letter are "aaa", "aa", "a", "b".
"aaa" occurs 1 time.
"aa" occurs 2 times.
"a" occurs 4 times.
"b" occurs 1 time.
So the answer is 1 + 2 + 4 + 1 = 8.
```

**Example 2:**

```
Input: S = "aaaaaaaaaa"
Output: 55
```

Algorithm:

First we use a DP solution to solve the problem. For dp\[i][j] it means if the String from i to j consists only of distinct letter. Then we count the number. The time complexity is O(n^2).

We can find that if there are two different letters, like **\*ab\**, we can already know the number before a, and after b, cause they cannot form one valid string. So we just use two pointer to continuous find the valid string, and use math formula.