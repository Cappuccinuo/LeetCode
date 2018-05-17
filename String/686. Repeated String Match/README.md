Time spent : 20 min(self)

GIVEN: two string A and B

RETURNS: the minimum number of times A has to be repeated such that B is a substring of it.



EXAMPLES:

```
A = "abcd" and B = "cdabcdab".
```

```
Return 3. By repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
```



What's the smallest k for which B is a substring of A * k. Just try every k. Using a stringbuilder, we append A until stringbuilder's length is larger or equal to B's length. If B is in S, or in S + A, then return the corresponding k. Otherwise return -1.

Time Complexity: O(N * (M + N)), M, N is the length of A, B.

Space Complexity: O(M + N).