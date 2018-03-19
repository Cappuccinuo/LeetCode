Time spent : 40 min (see hint)

GIVEN: a non-negative integer n

RETURNS: count the number of prime numbers less than n

EXAMPLES:

Input: 

```
18
```

Output: 7 (2, 3, 5, 7, 11, 13, 17)



Method : [Sieve of Eratosthenes][https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes]

### Pseudocode

```
 Input: an integer n > 1.
 
 Let A be an array of Boolean values, indexed by integers 2 to n,
 initially all set to true.
 
 for i = 2, 3, 4, ..., not exceeding √n:
   if A[i] is true:
     for j = i^2, i^2+i, i^2+2i, i^2+3i, ..., not exceeding n:
       A[j] := false.
 
 Output: all i such that A[i] is true.
```