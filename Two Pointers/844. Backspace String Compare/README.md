Time spent :  5 min(Self)

GIVEN: Given two strings `S` and `T`

RETURNS: return if they are equal when both are typed into empty text editors. `#` means a backspace character.

EXAMPLES:

**Example 1:**

```
Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
```

**Example 2:**

```
Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
```

**Example 3:**

```
Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
```

**Example 4:**

```
Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
```

Algorithm:

Using two pointers, compare from the back of two strings. Using a variable back to mark the current back number.