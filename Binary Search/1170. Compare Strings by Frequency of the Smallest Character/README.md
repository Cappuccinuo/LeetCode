Time spent :  10 min(Self)

GIVEN:Let's define a function `f(s)` over a non-empty string `s`, which calculates the frequency of the smallest character in `s`. For example, if `s = "dcce"` then `f(s) = 2` because the smallest character is `"c"` and its frequency is 2.

Now, given string arrays `queries` and `words`

RETURNS: an integer array `answer`, where each `answer[i]` is the number of words such that `f(queries[i])` < `f(W)`, where `W` is a word in `words`.

EXAMPLES:

**Example 1:**

```
Input: queries = ["cbd"], words = ["zaaaz"]
Output: [1]
Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz").
```

**Example 2:**

```
Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
Output: [1,2]
Explanation: On the first query only f("bbb") < f("aaaa"). On the second query both f("aaa") and f("aaaa") are both > f("cc").
```

Algorithm:

We can get the frequency of the words first, then sort it. For each query, we use binary search to find how many words have frequency larger than it. 