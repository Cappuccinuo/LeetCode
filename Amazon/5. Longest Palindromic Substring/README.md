Time spent : 20 min(see hint)

GIVEN: a string s

RETURNS: longest palindromic substring in s

EXAMPLES:

```
Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
```

```
Input: "cbbd"

Output: "bb"
```



We can use dynamic programming

1. dp is a two-d array that represents if string from index i to j is palindrome.
2. we traverse according to the length, from 1 to len of string.
3. when i and j in string is equal, and l <= 2 or the (i+1, j-1) is palindrome, that mark true 





1. The key point is to deal with odd and even situation. Like "aba" or "bb".

2. we can use a integer to record current palindrome length and traverse the string. 

   For example, to string "abcba"

   When i = 1, currCharNum = 0, "a" is a palindrome, so res = "a", currCharNum = 1. 

   When i = 3, currCharNum = 1, "bcb"(3 - 2, 3)is palindrome, so res = "bcb", currCharNum = 3. We need to look abcba, s index from 4 - currCharNum - 1, to 4. "abcba" is a palindrome, so res = "abcba".

   ```
           if (isPalindrome(s, i - currCharNum - 1, i)) {
               res = s.substring(i - currCharNum - 1, i + 1);
               currCharNum += 2;
           }
           else if (isPalindrome(s, i - currCharNum, i)) {
               res = s.substring(i - currCharNum, i + 1);
               currCharNum += 1;
           }
   ```

