Time spent : 20 min(See hint)

GIVEN: a string S of lowercase letters

RETURNS: max partition list(as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.)

**Example 1:**

```
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.

```



For each letter encountered, process the last occurence of that letter, keep two pointers, one is the current rightmost position of letter. The other is the next traverse start. When current index is the same as rightmost position, we add current size i - pivot + 1 into result list, and set pivot to i + 1.