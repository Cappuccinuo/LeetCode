Time spent : 5 min(See hint)

Solution : DFS

GIVEN: a list of NestedInteger

RETURNS: the sum all the integers in the list weighted by their depth

EXAMPLES:

Input: 

```
[[1,1],2,[1,1]]
```

Output: 10

DESIGN STRATEGY: DFS



1. traverse the list using for-each, for(NestedInteger ni : nestedList)

2. if ni is integer, sum += ni.getInteger() * depth

3. otherwise using the function to calculate the nested list in ni of next depth.     

   sum += sumCalculator(ni.getList(), depth + 1)
