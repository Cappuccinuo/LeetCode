Time spent :  15 min(See hint)

GIVEN: Given a string that consists of only uppercase English letters, you can replace any letter in the string with another letter at most *k* times. 

RETURNS: Find the length of a longest substring containing all repeating letters you can get after performing the above operations.

EXAMPLES:

**Example 1:**

```
Input:
s = "ABAB", k = 2

Output:
4

Explanation:
Replace the two 'A's with two 'B's or vice versa.
```



**Example 2:**

```
Input:
s = "AABABBA", k = 1

Output:
4

Explanation:
Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
```

Algorithm:

We can replace any letter with another letter, so we just need to know which letter has the highest occurance, if that is max, then end - start - max should smaller or equal to k. Typical sliding window problem.