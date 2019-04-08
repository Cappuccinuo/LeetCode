Time spent :  10 min(See hint)

GIVEN: Given a `rows x cols` screen and a sentence represented by a list of **non-empty** words

RETURNS: **how many times** the given sentence can be fitted on the screen.

EXAMPLES:

**Example 1:**

```
Input:
rows = 2, cols = 8, sentence = ["hello", "world"]

Output: 
1

Explanation:
hello---
world---

The character '-' signifies an empty space on the screen.
```



**Example 2:**

```
Input:
rows = 3, cols = 6, sentence = ["a", "bcd", "e"]

Output: 
2

Explanation:
a-bcd- 
e-a---
bcd-e-

The character '-' signifies an empty space on the screen.
```



**Example 3:**

```
Input:
rows = 4, cols = 5, sentence = ["I", "had", "apple", "pie"]

Output: 
1

Explanation:
I-had
apple
pie-I
had--

The character '-' signifies an empty space on the screen.
```

Algorithm:

Instead of traversing all rows and fit the word one by one, we can save some time on it.

For each sentence word, we can know two things:

If the word is at the first position of the row, which word will fall in next row, and how many times the sentence can fill for that row.