Time spent : 15 min(Self)

GIVEN: a non-empty array of integers

RETURNS: the third maximum number in this array

EXAMPLES:

Input: 

```
[3, 2, 1]
```

Output: 1

Input: 

```
[1, 2]
```

Output: 2

Input: 

```
[2, 2, 3, 1]
```

Output: 1



The tricky part of this question is to deal with Integer.MIN_VALUE

like[Integer.MIN_VALUE, 1, 2], [1, Integer.MIN_VALUE, 2], [1, 2, Integer.MIN_VALUE]

Set up three integer max, initial value is null.

Go through the nums array, if num equals to any one of the three integers, continue the loop. Otherwise deal with the swap based on num comparing with the three nums.