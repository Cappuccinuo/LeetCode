Time spent : 20 min(self + see hint of last solution)

GIVEN: a string

RETURNS: count how many palindromic substrings in this string



EXAMPLES:

```
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
```

```
Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
```



Solution 1 : 

for every character, add 1 to the memorization array dp[i] + 1

check substring from 0, … to i + 1

very slow, 567ms

Solution 2 :

use palindrome judge when s.charAt(i - 1) == s.charAt(i + 1) and s.charAt(i - 1) == s.charAt(i)

better but not fast, 32 ms

Solution 3:

Transfer solution 2 to a easy program. Basically, we should check the odd length and even length palindrome string, like "aba" and "abba"



checkPalindrome need 3 parameters, String s, int lo, int hi

`while (lo >= 0 && hi < length() && s.charAt(lo) == s.charAt(hi)) {`

`count++; lo—; hi++;}`

We only need to execute 

checkPalindrome(s, i, i)

checkPalindrome(s, i, i+1)