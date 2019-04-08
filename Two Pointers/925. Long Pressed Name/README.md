Time spent :  5 min(Self)

GIVEN: Your friend is typing his `name` into a keyboard.  Sometimes, when typing a character `c`, the key might get *long pressed*, and the character will be typed 1 or more times. Given name and typed name.

RETURNS: Return `True` if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

EXAMPLES:

**Example 1:**

```
Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
```

**Example 2:**

```
Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
```

**Example 3:**

```
Input: name = "leelee", typed = "lleeelee"
Output: true
```

**Example 4:**

```
Input: name = "laiden", typed = "laiden"
Output: true
Explanation: It's not necessary to long press any character.
```

Algorithm:

Typical two pointer problem. Need to track the frequency of each corresponding character.