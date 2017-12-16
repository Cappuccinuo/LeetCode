Time spent : 15 min(See solution)

GIVEN: a number n

RETURNS: true iff n is happy number

Note: A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example : 19 is a happy number

- 12 + 92 = 82
- 82 + 22 = 68
- 62 + 82 = 100
- 12 + 02 + 02 = 1



1. basically, it is a problem of cycle detection.

2. Cycle detection (Wikipedia)

   In [computer science](https://en.wikipedia.org/wiki/Computer_science), **cycle detection** or **cycle finding** is the [algorithmic](https://en.wikipedia.org/wiki/Algorithm) problem of finding a cycle in a [sequence](https://en.wikipedia.org/wiki/Sequence) of [iterated function](https://en.wikipedia.org/wiki/Iterated_function) values.

   For any [function](https://en.wikipedia.org/wiki/Function_(mathematics)) f that maps a [finite set](https://en.wikipedia.org/wiki/Finite_set) S to itself, and any initial value *x*0 in S, the sequence of iterated function values

   x0, x1 = f(x0), x2 = f(x1)…xi = f(xi - 1)

   must eventually use the same value twice: there must be some pair of distinct indices i and j such that *xi* = *xj*. Once this happens, the sequence must continue [periodically](https://en.wikipedia.org/wiki/Periodic_sequence), by repeating the same sequence of values from *xi* to *x**j* − 1. Cycle detection is the problem of finding i and j, given f and *x*0.

3. Like the linked list cycle problem, we use a slow and a fast pointer.

4. Difference between do while and while:

   do { a…} while (b);    the program will execute a regardless of b.

   while(b);   the loop will execute when b is true