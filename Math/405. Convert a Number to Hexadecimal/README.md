Time spent : 5 min(See hint)

GIVEN: an integer

RETURNS: its hexadecimal format



**Example 1:**

```
Input:
26

Output:
"1a"
```

**Example 2:**

```
Input:
-1

Output:
"ffffffff"
```

 

Construct a char map contains all the 16 digits.

Everytime we append map[num & 15], that is we look at the last four digits of binary version of the input, and maps that to hex char shift the input to the right by 4 bits, do it again until input becomes 0.