Time spent :  10 min

GIVEN: Given a list of 24-hour clock time points in "Hour:Minutes" format

RETURNS: the minimum **minutes** difference between any two time points in the list.

EXAMPLES:

```
Input: ["23:59","00:00"]
Output: 1
```

Algorithm:

We need to sort the list to make the time ascending. While using Collections.sort(), we can use bucket sort, cause the minute only have 24 * 60 possibilities.