Time spent : 20min(see a little hint)

GIVEN: a string s and a number k

RETURNS: reversed version, reverse first k characters for every 2k characters counting from the start of the string

Note:  If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.

EXAMPLES:

```
Input: "babad"   2

Output: "ababd"
```



1. The key point is to judge the end index of reverse. 
2. The end point j = Math.min(i - k + 1, s.length() - 1)

