Time spent :  5 min(Self)

GIVEN: Given words `first` and `second`, consider occurrences in some `text` of the form "`first second third`", where `second` comes immediately after `first`, and `third` comes immediately after `second`.

RETURNS: For each such occurrence, add "`third`" to the answer, and return the answer.

EXAMPLES:

**Example 1:**

```
Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
Output: ["girl","student"]
```

**Example 2:**

```
Input: text = "we will we will rock you", first = "we", second = "will"
Output: ["we","rock"]
```

Algorithm:

Using a pointer to check adjacent two words, and add third word if rules apply.