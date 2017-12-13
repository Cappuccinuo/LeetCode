Time spent : 30 min

Solution : HashMap	

Design and implement a TwoSum class. It should support the following operations: `add` and `find`.

`add` - Add the number to an internal data structure.
`find` - Find if there exists any pair of numbers which sum is equal to the value.

EXAMPLES:

```
add(1); add(3); add(5);
find(4) -> true
find(7) -> false
```

DESIGN STRATEGY: HashMap



Add part is obvious, key is number, and value is the number of the key that appears.

Cause the sum is not only the sum of two, maybe its the sum of three or four, so

we need to have a int number remain = value - i

if the remain is the current key, if the key has more than two, than it is true.

Otherwise, if map has the key remain, return true.