Time spent : 20 min(Self)

GIVEN: a string s and a list of strings dict 

RETURNS: add a closed pair of bold tag `<b>` and `</b>` to wrap the substrings in s that exist in dict. If two such substrings overlap, you need to wrap them together by only one pair of closed bold tag. Also, if two substrings wrapped by bold tags are consecutive, you need to combine them.

EXAMPLES:

**Example 1:**

```
Input: 
s = "abcxyz123"
dict = ["abc","123"]
Output:
"<b>abc</b>xyz<b>123</b>"
```



**Example 2:**

```
Input: 
s = "aaabbcc"
dict = ["aaa","aab","bc"]
Output:
"<b>aaabbc</b>c"
```

Algorithm:

Using the idea of merge interval. First find all the interval of the word in dict that is part of s. Then merge them. 