Time spent : 30 min(self)

GIVEN: a string

RETURNS: true iff it is a palindrome, considering only alphanumeric characters and ignoring cases

EXAMPLES:

`"A man, a plan, a canal: Panama"` is a palindrome.
`"race a car"` is *not* a palindrome.



1. We can use regex match to filter the string first.  s = s.replaceAll("[^0-9a-zA-Z]", "").toUpperCase();
2. Then use the general two pointers method to check if the string is a palindrome.
3. Faster solution is when came across character other than letter and num, move the pointer can continue. If two character is not the same, when they are num, return false. Otherwise check the case.
4. A tricky part is when string like "0P", 0 + 'A' - 'a' = 'P'
