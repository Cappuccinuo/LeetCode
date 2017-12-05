Time spent : 20min

GIVEN: a non-negative integer N

RETURNS: the largest number that is less than or equal to N with monotone increasing digits

 *monotone increasing digits* if and only if each pair of adjacent digits `x` and `y` satisfy `x <= y`

EXAMPLES:

```
Input: N = 10
Output: 9
Input: N = 1234
Output: 1234
Input: N = 332
Output: 299
```



1. First transfer the int to a string, and transfer the string to int array.
2. Traverse the array from back. If arr[i] > arr[i - 1], arr[i - 1]—, it is convenient for number like 100, 4321. And record the last minus number index i - 1
3. Use a stringbuilder, if the arr[0] is not 0, append arr[0…level], level + 1 to len - 1 is 9. Else append 1 to len - 1 all 9

