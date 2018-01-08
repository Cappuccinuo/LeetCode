Time spent : 20 min(See hint)

GIVEN: an array of integers and an integer K

RETURNS: number of unique k-diff pairs in the array

EXAMPLES:

```
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
```

```
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
```

```
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
```



1. First sort the array. Make two integers pre and post as two pointers.
2. When pre and post overlap, or nums[pre] + k > nums[post], post move forward.
3. When pre is larger than 0 and nums[pre - 1] == nums[pre], or nums[pre] + k < nums[post], pre move forward.
4. Otherwise count++, pre and post move forward.



Or we can use hashmap to solve this problem

1. If k < 0, return 0.
2. Go through map's entrySet. If k == 0, just check the entry.getValue() >= 2, then count++.
3. Else if map.containsKey(entry.getKey() + 1), count++.

