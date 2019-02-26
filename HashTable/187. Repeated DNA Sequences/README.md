Time spent :  15 min(Self)

GIVEN: String contains A,G,C,T

RETURNS: Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

**Example:**

```
Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"

Output: ["AAAAACCCCC", "CCCCCAAAAA"]
```

Algorithm:

Instead of store the entire string, we use some bit number to represent each string.

We found that A,G,C,T are only 4 characters, if we use 0, 1, 2, 3 to represent each character

For each character,

current &= 0x3FFFF(00111111111111111111)  18 bit

current = current << 2

current |= val of character

Using this current, we can know which string has occured.