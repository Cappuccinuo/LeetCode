Time spent :  5 min(Self)

GIVEN: an array of numbers nums, two elements appear only once and the other appear exactly twice

RETURNS: The two elements that appear only once

EXAMPLES:

```
Input:  [1,2,1,3,2,5]
Output: [3,5]
```

Algorithm:

First we can get the xor result of the two single number.

The result actually means the different position of the two number.

So to distinguish all the numbers, we extract the last 1 of the xor result.

 x & (-x) : Returns the rightmost 1 in binary representation of x

(-x) is the two’s complement of x. (-x) will be equal to one’s complement of x plus 1. 
Therefore (-x) will have all the bits flipped that are on the left of the rightmost 1 in x.

x & (-x) will return rightmost 1.

x = 10 = (1010)2
(-x) = -10 = (0110)2
x & (-x) = (1010)2 & (0110)2 = (0010)2

The two number will then distributed to two group, where we can apply trick of single number I.