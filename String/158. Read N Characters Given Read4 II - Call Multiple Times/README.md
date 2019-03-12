Time spent :  5 min(Self)

GIVEN: Given a file and assume that you can only read the file using a given method `read4`, implement a method `read` to read *n* characters. **Your method read may be called multiple times.**

EXAMPLES:

**Example 1:**

```
File file("abc");
Solution sol;
// Assume buf is allocated and guaranteed to have enough space for storing all characters from the file.
sol.read(buf, 1); // After calling your read method, buf should contain "a". We read a total of 1 character from the file, so return 1.
sol.read(buf, 2); // Now buf should contain "bc". We read a total of 2 characters from the file, so return 2.
sol.read(buf, 1); // We have reached the end of file, no more characters can be read. So return 0.
```

**Example 2:**

```
File file("abc");
Solution sol;
sol.read(buf, 4); // After calling your read method, buf should contain "abc". We read a total of 3 characters from the file, so return 3.
sol.read(buf, 1); // We have reached the end of file, no more characters can be read. So return 0.
```

Algorithm:

Same as last question, only we need to put our start and end and cache as global var.