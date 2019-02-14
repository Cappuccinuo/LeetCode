Time spent :  5 min(See hint)

GIVEN: an unsorted array

RETURNS: whether an increasing subsequence of length 3 exists or not in the array.

O(n) time, O(1) space

EXAMPLES:

**Example 1:**

```
Input: [1,2,3,4,5]
Output: true
```

**Example 2:**

```
Input: [5,4,3,2,1]
Output: false
```

Algorithm:

The basic idea is that the SecondMin value will be updated only if there is at least one smaller value before it.

```java
if (num <= min) {
	min = num;
}
else if (num <= smin) {
	smin = num;
}
else {
	return true;
}
```

