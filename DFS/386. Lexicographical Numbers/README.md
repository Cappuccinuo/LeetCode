Time spent :  15 min(See hint)

GIVEN: an integer n

RETURNS: 1 - *n* in lexicographical order.

EXAMPLES:

given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].

Algorithm:

DFS problem.

​    1

/      \

0 ...   9

For 1 to 9, we do DFS on it, as it go deeper, so every time the number is smaller than n, we can add to list.