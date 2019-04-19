Time spent : 5 min

Solution : String -> Integer	

GIVEN: a String 

RETURNS: the first non-repeating character in it and return its index. If it doesn't exist, return -1.

EXAMPLES:

Input: 

```
"leetcode"
```

Output: 0

Input: 

```
"loveleetcode"
```

Output: 2

DESIGN STRATEGY: Use HashMap to store the times of each character, then traverse the string, if the time is 1, return the index.



2018.4.13 Faster: We can traverse the 26 characters, for every character, we use indexOf to get its current index in the string, if it exist, we use lastIndexOf to get its last index in the string, compare the two, update the firstIndex variable.



2019.4.19 Data Stream: Use the idea of LRU. We store the char and index in a ListCharNode, maintain a list of frequency 1 character. When the character is visited twice, we remove it from the list.