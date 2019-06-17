Time spent :  10 min(Self)

GIVEN: A string `S` represents a list of words. Each letter in the word has 1 or more options.  If there is one option, the letter is represented as is.  If there is more than one option, then curly braces delimit the options. 

RETURNS: Return all words that can be formed in this manner, in lexicographical order. 

EXAMPLES:

**Example 1:**

```
Input: "{a,b}c{d,e}f"
Output: ["acdf","acef","bcdf","bcef"]
```

**Example 2:**

```
Input: "abcd"
Output: ["abcd"]
```

Algorithm:

We can use backtracking approach and BFS approach.