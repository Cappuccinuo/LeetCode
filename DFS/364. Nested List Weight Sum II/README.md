Time spent : 10 min(See hint)

Solution : DFS

GIVEN: a list of NestedInteger

RETURNS: the sum all the integers in the list weighted by their depth

Note: Different from the [previous question](https://leetcode.com/problems/nested-list-weight-sum/) where weight is increasing from root to leaf, now the weight is defined from bottom up. i.e., the leaf level integers have weight 1, and the root level integers have the largest weight.

EXAMPLES:

Input: 

```
[[1,1],2,[1,1]]
```

Output: 8(four 1's at depth 1, one 2 at depth 2)



1. We need to keep to integer to store weighted sum and unweighted sum. Every time we go deeper in the nestedlist, we just need to add weighted sum again and add unweighed sum, that is the new integer sum.
2. So we will go through the list until the list is empty. We can initiate an empty list, every time we come up with an integer, we add it to unweighted, if it is an nestedList, we add it to the empty list, that list will be the new nestedList.
