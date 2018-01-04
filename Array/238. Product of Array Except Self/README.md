Time spent : 15 min(See hint)

GIVEN: an array of n integers where n > 1, nums

RETURNS: an array output such that output[i] is equal to the product of all the elements of nums except nums[i]

EXAMPLES:

```
Input  : [1,2,3,4]
Output : [24,12,8,6]
```

For [1,2,3,4]

| Numbers: |   1    |  2   |  3   |   4    |
| :------: | :----: | :--: | :--: | :----: |
|  Left:   |   1    |  1   | 1*2  | 1\*2*3 |
|  Right:  | 2\*3*4 | 3*4  |  4   |   1    |

Store left in result array, store right in a variable.