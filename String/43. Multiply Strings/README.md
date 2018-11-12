Time spent :  30 min(See hint)

GIVEN: two non-negative integers num1 and num2

RETURNS: the product of num1 and num2, also represented as a string

EXAMPLES:

**Example 1:**

```
Input: num1 = "2", num2 = "3"
Output: "6"
```

**Example 2:**

```
Input: num1 = "123", num2 = "456"
Output: "56088"
```

Algorithm:

![Multiplication](https://drscdn.500px.org/photo/130178585/m%3D2048/300d71f784f679d5e70fadda8ad7d68f)

Traverse num1 and num2. current i, j 's sum equals mul + carry + pos[i + j + 1]. 

Carry will update to sum / 10, pos[i + j + 1] will update to sum % 10, after we traverse j, we update pos[i + j + 1] to carry.