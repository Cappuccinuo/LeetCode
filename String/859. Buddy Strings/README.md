Time spent :  25 min(self)

GIVEN: Two strings A and B of lowercase letters

RETURNS: True iff we can swap two letters in A so that the result equals B



**Example 1:**

```
Input: A = "ab", B = "ba"
Output: true
```

**Example 2:**

```
Input: A = "ab", B = "ab"
Output: false
```

**Example 3:**

```
Input: A = "aa", B = "aa"
Output: true
```

**Example 4:**

```
Input: A = "aaaaaaabc", B = "aaaaaaacb"
Output: true
```

**Example 5:**

```
Input: A = "", B = "aa"
Output: false
```

 

Algorithm:

If length of A and B is different, return false.

If A and B are equal, check if there are more than two pairs equal character.

Otherwise check if there are only two diff pairs, and they can swap.