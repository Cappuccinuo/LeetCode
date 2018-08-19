Time spent :  10 min(See hint)

GIVEN: a list of non negative integers

RETURNS: the largest number they form 

EXAMPLES:

**Example 1:**

```
Input: [10,2]
Output: "210"
```

**Example 2:**

```
Input: [3,30,34,5,9]
Output: "9534330"
```

Algorithm:

Convert each integer to string first. Then sort the strings. For two string with same leading digits, like 3 and 30, we compare by concatenating two strings. That is, 330 and 303. 