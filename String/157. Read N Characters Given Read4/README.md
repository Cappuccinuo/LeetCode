Time spent :  5 min(Self)

GIVEN: Given a file and assume that you can only read the file using a given method `read4`

RETURNS: implement a method to read *n* characters.

EXAMPLES:

**Example 1:**

```
Input: file = "abc", n = 4
Output: 3
Explanation: After calling your read method, buf should contain "abc". We read a total of 3 characters from the file, so return 3. Note that "abc" is the file's content, not buf. buf is the destination buffer that you will have to write the results to.
```

**Example 2:**

```
Input: file = "abcde", n = 5
Output: 5
Explanation: After calling your read method, buf should contain "abcde". We read a total of 5 characters from the file, so return 5.
```

**Example 3:**

```
Input: file = "abcdABCD1234", n = 12
Output: 12
Explanation: After calling your read method, buf should contain "abcdABCD1234". We read a total of 12 characters from the file, so return 12.
```

**Example 4:**

```
Input: file = "leetcode", n = 5
Output: 5
Explanation: After calling your read method, buf should contain "leetc". We read a total of 5 characters from the file, so return 5.
```

Algorithm:

We will init two pointers start and end.

And one field record total count now. 

Every time if start == end, we read4 into our cache array.

Use start pointer to fill in buf array.