Time spent : 40 min (Self + see hint)

GIVEN: Given an array *S* of *n* integers

RETURNS: the majority element list that appears more than n/3 times.

EXAMPLES:

Input: 

```
S = {1,2,2,3,2,1,1,3}
```

Output:[2,1]



Method : [Boyer-Moore Voting Algorithm][https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm]

Counting instances of the majority element as +1 and instances of any other element as -1. 

- Initialize an element m and a counter i with *i* = 0
- For each element of the input sequence:
  - If *i* = 0, then assign *m* = *x* and *i* = 1
  - else if *m* = *x*, then assign *i* = *i* + 1
  - else assign *i* = *i* − 1
- Return m

Time complexity: O(n)

Space complexity: O(1)



We make two candidate here, cause only 2 exists can appear more than n/3 times. The key point here is do the second step first. Cause if candidate2 is 2, count1 = 0, and current num is 2, we can't make candidate1 2. After we finish the iteration. We need to make sure two candidate are both appeare more than n/3 times. If so, add to the result.



