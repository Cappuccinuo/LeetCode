Time spent :  5 min(Self)

GIVEN: a list of string

RETURNS: group all strings that belong to the same shifting sequence.

Note: Given a string, we can "shift" each of its letter to its successive letter, for example: `"abc" -> "bcd"`. We can keep "shifting" which forms the sequence:

```
"abc" -> "bcd" -> ... -> "xyz"
```

EXAMPLES:

**Example:**

```
Input: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
Output: 
[
  ["abc","bcd","xyz"],
  ["az","ba"],
  ["acef"],
  ["a","z"]
]
```

Algorithm:

Using difference between letters to flag. 

Like az -> 25, ba -> -1 + 26

For negative difference, we add 26 to it.