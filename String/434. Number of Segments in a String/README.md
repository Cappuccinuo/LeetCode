Time spent : 10 min(self)

GIVEN: a string

RETURNS: the number of segments in the string

EXAMPLES:

```
Input: "Hello, my name is John"
Output: 5
```

1. Use built-in library, first trim the string, if after trim the length is 0, return 0. Otherwise return the trim string split by space.
2. Traverse the char array. If s.charAt(i) != ' ' && s.charAt(i - 1) == ' '. Here we should know that if i is 0, the situation may change.
3. Use substring. Same idea with the second solution. Every segment is count when non-space string + space string. Here we need to append string with " " so we can count the last segment.