Time spent : 10min (self)

Solution : String -> Boolean	

GIVEN: a String

RETURNS: reverse the string word by word

EXAMPLES:

Input: 

```
" the sky  is      blue    "
```

Output: 

"blue is sky the"



1. Split the string with blank space. While the space can be 1, or 2, or more. In split method in String, \s represents any blank character, + represents match multiple times. So s.split("\\\s+").
2. First I use hashmap and stringbuilder, it is not efficient. So use built-in method will be faster.
