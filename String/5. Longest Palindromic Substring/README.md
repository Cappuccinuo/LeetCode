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

