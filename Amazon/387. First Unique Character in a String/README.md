Time spent :30 min(self)

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



2018.4.15 Using Data Stream Method

Use a hashmap to keep the prev node of current char, use a linked list to link all the unique characters so far, and use a hashset to record the duplicate characters.

2018.4.13 Faster: We can traverse the 26 characters, for every character, we use indexOf to get its current index in the string, if it exist, we use lastIndexOf to get its last index in the string, compare the two, update the firstIndex variable.