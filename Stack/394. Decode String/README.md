Time spent : 40 min(See hint)

Solution : Stack

GIVEN: an encoded string

RETURNS: decoded string

EXAMPLES:

```
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
```

Use two stacks, one stores numbers, one stores strings.

When s.charAt(index) is digit, we need to know how large is this number. So use a while loop to get count = 10 * count + (s.charAt(index) - '0')

When s.charAt(index) is '[', we need to push current result string into the stack, set result to "".

When s.charAt(index) is "]", we should multiply current result with the numStack.pop(), and append to the tail of strStack.pop()

Other case we just add the charcter to the result string.