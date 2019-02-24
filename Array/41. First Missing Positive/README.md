Time spent :  40 min(See hint)

GIVEN: an unsorted integer array

RETURNS: the smallest missing positive integer

EXAMPLES:

**Example 1:**

```
Input: [1,2,0]
Output: 3
```

**Example 2:**

```
Input: [3,4,-1,1]
Output: 2
```

**Example 3:**

```
Input: [7,8,9,11,12]
Output: 1
```

Algorithm:

```Java
		// [3, 4, -1, -2, 0, 16, 5, 5, 1, 2]
        // len is 10, the max possible missing positive is 11
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // Trick: So we replace all the num smaller or equal to 0
        // Or larger than len 10 To 1
        
        // [3, 4, 1, 1, 1, 1, 5, 5, 1, 2]
        // The problem is that we need to first know if 1 exists in nums array
        
        // First traverse: 
        // 1. Check if 1 is in nums array
        // 2. Do the trick above
        
         // If we don't have one in array, return 1
        // Or if the len is 1 and we have one, we return 2
        
        // Second traverse:
        // As we need to figure out which positive number is missing
        // We make the number who has occured in the array negative
        // So array becomes 
        // [-3, -4, -1, -1, -1, -1, 5, 5, 1, 2]
        
        // Third traverse:
        // The missing positive number is the first number which is not negative
        
        // Otherwise it is the max possible missing positive: len + 1
```

