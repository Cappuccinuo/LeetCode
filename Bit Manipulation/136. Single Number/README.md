Time spent : 10 min(self)

GIVEN: a non-empty array of integers, every element appears twice except for one

RETURNS: the single one

EXAMPLES:

**Example 1:**

```
Input: [2,2,1]
Output: 1
```

**Example 2:**

```
Input: [4,1,2,1,2]
Output: 4
```



Method 1 : Using a hashmap to store the frequency of every word, and find the word with frequency 1.

Method 2 : Using XOR property. 0 ^ N = N, N ^ N = 0. As all numbers except one appear twice, they can cancel each other, and just left the single number.

