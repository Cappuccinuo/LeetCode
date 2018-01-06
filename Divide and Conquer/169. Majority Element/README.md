Time spent : 60 min (Self + see hint)

GIVEN: Given an array *S* of *n* integers

RETURNS: the majority element

Note: the majority element is the element that appears more than n/2 times.

EXAMPLES:

Input: 

```
S = {-1 2 -1 -4 -1}
```

Output:-1



Method 1: Sorting

If the elements are sorted in monotonically increasing or decreasing order, the majority element can be found at index n/2.

Time Complexity : O(nlgn)

Space complexity : O(1) 

(O(n) if it is not allowed to sort nums in place)



Method 2: Hash Map

The key is the integer, the value is the frequency. Once we come across a number, whose frequency is larger than half of the nums length, result is that num.

Time complexity: O(n)  (May iterate over nums once)

Space complexity: At most hashmap contain n - n/2 associations.



Method 3: Divide and conquer

If we know the majority element in the left and right halves of an array, we can determine which is the global majority element in linear time.

Recurse on left and right halves of an array. Use lo and hi indices the relevant slice of the overall array. The majority element of a length-1 slice is trivially its only element, so the recursion stops there.

If the current slice is longer than length-1, we must combine the answers for the slice's left and right halves. If they agree on the majority element, then the majority element for the overall slice is obviously the same. If they disagree, only one of them can be "right", so we need to count the occurrences of the left and right majority elements to determine which subslice's answer is globally correct.

Time complexity: O(nlgn) Use [master therom][https://en.wikipedia.org/wiki/Master_theorem_(analysis_of_algorithms)]

Space complexity: O(lgn)   recursion tree is traversed in a depth-first manner, space complexity is therefore equivalent to the length of the longest path.



Method 4: [Boyer-Moore Voting Algorithm][https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm]

Counting instances of the majority element as +1 and instances of any other element as -1. 

- Initialize an element m and a counter i with *i* = 0
- For each element of the input sequence:
  - If *i* = 0, then assign *m* = *x* and *i* = 1
  - else if *m* = *x*, then assign *i* = *i* + 1
  - else assign *i* = *i* − 1
- Return m

Time complexity: O(n)

Space complexity: O(1)

