Time spent : 30 min(See hint)

GIVEN: An encoded string S is given, and an index K

RETURNS: the K-th letter (1 indexed) in the decoded string

EXAMPLES:

**Example 1:**

```
Input: S = "leet2code3", K = 10
Output: "o"
Explanation: 
The decoded string is "leetleetcodeleetleetcodeleetleetcode".
The 10th letter in the string is "o".
```

**Example 2:**

```
Input: S = "ha22", K = 5
Output: "h"
Explanation: 
The decoded string is "hahahaha".  The 5th letter is "h".
```

**Example 3:**

```
Input: S = "a2345678999999999999999", K = 1
Output: "a"
Explanation: 
The decoded string is "a" repeated 8301530446056247680 times.  The 1st letter is "a".
```

Algorithm:

When a decoded string is equal to some word with size length repeated some number of times, such as apple with size = 5 repeated 6 times, the answer is the same for the index K as it is for the index K % size.

First we need to calculate the actual size of decoded string.

Then traverse backwards, if we see a digit S[i], it means the size of the decoded string after parsing S[0], S[1], ..., S[i - 1] will be size / Integer(S[i]). Otherwise it will be size - 1.